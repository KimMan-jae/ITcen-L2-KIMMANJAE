package itcen.l.kimmanjae.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import itcen.l.kimmanjae.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import itcen.l.kimmanjae.domain.*;


@Service
@Transactional
public class PolicyHandler{
    @Autowired RiderManageRepository riderManageRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='StartedCooking'")
    public void wheneverStartedCooking_RecieveDelivery(@Payload StartedCooking startedCooking){

        StartedCooking event = startedCooking;
        System.out.println("\n\n##### listener RecieveDelivery : " + startedCooking + "\n\n");


        

        // Sample Logic //
        RiderManage.recieveDelivery(event);
        

        

    }

}



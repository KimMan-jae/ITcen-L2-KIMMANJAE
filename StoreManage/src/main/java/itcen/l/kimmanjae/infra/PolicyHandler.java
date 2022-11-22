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
    @Autowired StoreManageRepository storeManageRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='CompletedPayment'")
    public void wheneverCompletedPayment_ReceiveOrder(@Payload CompletedPayment completedPayment){

        CompletedPayment event = completedPayment;
        System.out.println("\n\n##### listener ReceiveOrder : " + completedPayment + "\n\n");


        

        // Sample Logic //
        StoreManage.receiveOrder(event);
        

        

    }

}



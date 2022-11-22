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
    @Autowired CouponManageRepository couponManageRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='IssuedCoupon'")
    public void wheneverIssuedCoupon_ReceiveCoupon(@Payload IssuedCoupon issuedCoupon){

        IssuedCoupon event = issuedCoupon;
        System.out.println("\n\n##### listener ReceiveCoupon : " + issuedCoupon + "\n\n");


        

        // Sample Logic //
        CouponManage.receiveCoupon(event);
        

        

    }

}



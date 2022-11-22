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
    @Autowired PaymentRepository paymentRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='CanceledOrder'")
    public void wheneverCanceledOrder_CancelPayment(@Payload CanceledOrder canceledOrder){

        CanceledOrder event = canceledOrder;
        System.out.println("\n\n##### listener CancelPayment : " + canceledOrder + "\n\n");


        

        // Sample Logic //
        Payment.cancelPayment(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='RefusedOrder'")
    public void wheneverRefusedOrder_CancelPayment(@Payload RefusedOrder refusedOrder){

        RefusedOrder event = refusedOrder;
        System.out.println("\n\n##### listener CancelPayment : " + refusedOrder + "\n\n");


        

        // Sample Logic //
        Payment.cancelPayment(event);
        

        

    }

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='UsedCoupon'")
    public void wheneverUsedCoupon_SetCoupon(@Payload UsedCoupon usedCoupon){

        UsedCoupon event = usedCoupon;
        System.out.println("\n\n##### listener SetCoupon : " + usedCoupon + "\n\n");


        

        // Sample Logic //
        Payment.setCoupon(event);
        

        

    }

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='PlacedOrder'")
    public void wheneverPlacedOrder_PlacedBasket(@Payload PlacedOrder placedOrder){

        PlacedOrder event = placedOrder;
        System.out.println("\n\n##### listener PlacedBasket : " + placedOrder + "\n\n");


        

        // Sample Logic //
        Payment.placedBasket(event);
        

        

    }

}



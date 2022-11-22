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
    @Autowired MessageRepository messageRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='RefusedOrder'")
    public void wheneverRefusedOrder_ReceiveMessage(@Payload RefusedOrder refusedOrder){

        RefusedOrder event = refusedOrder;
        System.out.println("\n\n##### listener ReceiveMessage : " + refusedOrder + "\n\n");


        

        // Sample Logic //
        Message.receiveMessage(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='CatchedFood'")
    public void wheneverCatchedFood_ReceiveMessage(@Payload CatchedFood catchedFood){

        CatchedFood event = catchedFood;
        System.out.println("\n\n##### listener ReceiveMessage : " + catchedFood + "\n\n");


        

        // Sample Logic //
        Message.receiveMessage(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='RefundedPayment'")
    public void wheneverRefundedPayment_ReceiveMessage(@Payload RefundedPayment refundedPayment){

        RefundedPayment event = refundedPayment;
        System.out.println("\n\n##### listener ReceiveMessage : " + refundedPayment + "\n\n");


        

        // Sample Logic //
        Message.receiveMessage(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='StartedCooking'")
    public void wheneverStartedCooking_ReceiveMessage(@Payload StartedCooking startedCooking){

        StartedCooking event = startedCooking;
        System.out.println("\n\n##### listener ReceiveMessage : " + startedCooking + "\n\n");


        

        // Sample Logic //
        Message.receiveMessage(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='AcceptedOrder'")
    public void wheneverAcceptedOrder_ReceiveMessage(@Payload AcceptedOrder acceptedOrder){

        AcceptedOrder event = acceptedOrder;
        System.out.println("\n\n##### listener ReceiveMessage : " + acceptedOrder + "\n\n");


        

        // Sample Logic //
        Message.receiveMessage(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Delivered'")
    public void wheneverDelivered_ReceiveMessage(@Payload Delivered delivered){

        Delivered event = delivered;
        System.out.println("\n\n##### listener ReceiveMessage : " + delivered + "\n\n");


        

        // Sample Logic //
        Message.receiveMessage(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='PickedDelivery'")
    public void wheneverPickedDelivery_ReceiveMessage(@Payload PickedDelivery pickedDelivery){

        PickedDelivery event = pickedDelivery;
        System.out.println("\n\n##### listener ReceiveMessage : " + pickedDelivery + "\n\n");


        

        // Sample Logic //
        Message.receiveMessage(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='EndedCooking'")
    public void wheneverEndedCooking_ReceiveMessage(@Payload EndedCooking endedCooking){

        EndedCooking event = endedCooking;
        System.out.println("\n\n##### listener ReceiveMessage : " + endedCooking + "\n\n");


        

        // Sample Logic //
        Message.receiveMessage(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='CompletedPayment'")
    public void wheneverCompletedPayment_ReceiveMessage(@Payload CompletedPayment completedPayment){

        CompletedPayment event = completedPayment;
        System.out.println("\n\n##### listener ReceiveMessage : " + completedPayment + "\n\n");


        

        // Sample Logic //
        Message.receiveMessage(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='PlacedOrder'")
    public void wheneverPlacedOrder_ReceiveMessage(@Payload PlacedOrder placedOrder){

        PlacedOrder event = placedOrder;
        System.out.println("\n\n##### listener ReceiveMessage : " + placedOrder + "\n\n");


        

        // Sample Logic //
        Message.receiveMessage(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='CanceledOrder'")
    public void wheneverCanceledOrder_ReceiveMessage(@Payload CanceledOrder canceledOrder){

        CanceledOrder event = canceledOrder;
        System.out.println("\n\n##### listener ReceiveMessage : " + canceledOrder + "\n\n");


        

        // Sample Logic //
        Message.receiveMessage(event);
        

        

    }

}



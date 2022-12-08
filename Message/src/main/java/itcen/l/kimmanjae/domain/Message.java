package itcen.l.kimmanjae.domain;

import itcen.l.kimmanjae.domain.SendFeedback;
import itcen.l.kimmanjae.MessageApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Message_table")
@Data

public class Message  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private String id;
    
    
    
    
    
    private String orderId;
    
    
    
    
    
    private String customerId;
    
    
    
    
    
    private String storeId;
    
    
    
    
    
    private String riderId;
    
    
    
    
    
    private String publisher;
    
    
    
    
    
    private String message;

    @PostPersist
    public void onPostPersist(){


        SendFeedback sendFeedback = new SendFeedback(this);
        sendFeedback.publishAfterCommit();

    }

    public static MessageRepository repository(){
        MessageRepository messageRepository = MessageApplication.applicationContext.getBean(MessageRepository.class);
        return messageRepository;
    }




    public static void receiveMessage(RefusedOrder refusedOrder){

        Message message = new Message();
        message.publisher = "RefusedOrder";
        repository().save(message);

        

        /** Example 2:  finding and process
        
        repository().findById(refusedOrder.get???()).ifPresent(message->{
            
            message // do something
            repository().save(message);


         });
        */

        
    }
    public static void receiveMessage(CatchedFood catchedFood){

        Message message = new Message();
        message.publisher = "CatchedFood";
        repository().save(message);

        /** Example 2:  finding and process
        
        repository().findById(catchedFood.get???()).ifPresent(message->{
            
            message // do something
            repository().save(message);


         });
        */

        
    }
    public static void receiveMessage(RefundedPayment refundedPayment){

        Message message = new Message();
        message.publisher = "RefundedPayment"
        repository().save(message);

        /** Example 2:  finding and process
        
        repository().findById(refundedPayment.get???()).ifPresent(message->{
            
            message // do something
            repository().save(message);


         });
        */

        
    }
    public static void receiveMessage(StartedCooking startedCooking){

        Message message = new Message();
        message.publisher = "StartedCooking"
        repository().save(message);

        /** Example 2:  finding and process
        
        repository().findById(startedCooking.get???()).ifPresent(message->{
            
            message // do something
            repository().save(message);


         });
        */

        
    }
    public static void receiveMessage(AcceptedOrder acceptedOrder){

        Message message = new Message();
        message.publisher = "AcceptedOrder"
        repository().save(message);

        /** Example 2:  finding and process
        
        repository().findById(acceptedOrder.get???()).ifPresent(message->{
            
            message // do something
            repository().save(message);


         });
        */

        
    }
    public static void receiveMessage(Delivered delivered){

        Message message = new Message();
        message.publisher = "Delivered"
        repository().save(message);

        /** Example 2:  finding and process
        
        repository().findById(delivered.get???()).ifPresent(message->{
            
            message // do something
            repository().save(message);


         });
        */

        
    }
    public static void receiveMessage(PickedDelivery pickedDelivery){

        Message message = new Message();
        message.publisher = "PickedDelivery"
        repository().save(message);

        /** Example 2:  finding and process
        
        repository().findById(pickedDelivery.get???()).ifPresent(message->{
            
            message // do something
            repository().save(message);


         });
        */

        
    }
    public static void receiveMessage(EndedCooking endedCooking){

        Message message = new Message();
        message.publisher = "EndedCooking"
        repository().save(message);

        /** Example 2:  finding and process
        
        repository().findById(endedCooking.get???()).ifPresent(message->{
            
            message // do something
            repository().save(message);


         });
        */

        
    }
    public static void receiveMessage(CompletedPayment completedPayment){

        Message message = new Message();
        message.publisher = "CompletedPayment"
        repository().save(message);

        /** Example 2:  finding and process
        
        repository().findById(completedPayment.get???()).ifPresent(message->{
            
            message // do something
            repository().save(message);


         });
        */

        
    }
    public static void receiveMessage(PlacedOrder placedOrder){

        Message message = new Message();
        message.publisher = "PlacedOrder"
        repository().save(message);

        /** Example 2:  finding and process
        
        repository().findById(placedOrder.get???()).ifPresent(message->{
            
            message // do something
            repository().save(message);


         });
        */

        
    }
    public static void receiveMessage(CanceledOrder canceledOrder){

        Message message = new Message();
        message.publisher = "CanceledOrder"
        repository().save(message);

        /** Example 2:  finding and process
        
        repository().findById(canceledOrder.get???()).ifPresent(message->{
            
            message // do something
            repository().save(message);


         });
        */

        
    }


}

package itcen.l.kimmanjae.domain;

import itcen.l.kimmanjae.domain.ChangedStatus;
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


        ChangedStatus changedStatus = new ChangedStatus(this);
        changedStatus.publishAfterCommit();



        SendFeedback sendFeedback = new SendFeedback(this);
        sendFeedback.publishAfterCommit();

    }

    public static MessageRepository repository(){
        MessageRepository messageRepository = MessageApplication.applicationContext.getBean(MessageRepository.class);
        return messageRepository;
    }




    public static void receiveMessage(RefusedOrder refusedOrder){

        /** Example 1:  new item 
        Message message = new Message();
        repository().save(message);

        */

        /** Example 2:  finding and process
        
        repository().findById(refusedOrder.get???()).ifPresent(message->{
            
            message // do something
            repository().save(message);


         });
        */

        
    }
    public static void receiveMessage(CatchedFood catchedFood){

        /** Example 1:  new item 
        Message message = new Message();
        repository().save(message);

        */

        /** Example 2:  finding and process
        
        repository().findById(catchedFood.get???()).ifPresent(message->{
            
            message // do something
            repository().save(message);


         });
        */

        
    }
    public static void receiveMessage(RefundedPayment refundedPayment){

        /** Example 1:  new item 
        Message message = new Message();
        repository().save(message);

        */

        /** Example 2:  finding and process
        
        repository().findById(refundedPayment.get???()).ifPresent(message->{
            
            message // do something
            repository().save(message);


         });
        */

        
    }
    public static void receiveMessage(StartedCooking startedCooking){

        /** Example 1:  new item 
        Message message = new Message();
        repository().save(message);

        */

        /** Example 2:  finding and process
        
        repository().findById(startedCooking.get???()).ifPresent(message->{
            
            message // do something
            repository().save(message);


         });
        */

        
    }
    public static void receiveMessage(AcceptedOrder acceptedOrder){

        /** Example 1:  new item 
        Message message = new Message();
        repository().save(message);

        */

        /** Example 2:  finding and process
        
        repository().findById(acceptedOrder.get???()).ifPresent(message->{
            
            message // do something
            repository().save(message);


         });
        */

        
    }
    public static void receiveMessage(Delivered delivered){

        /** Example 1:  new item 
        Message message = new Message();
        repository().save(message);

        */

        /** Example 2:  finding and process
        
        repository().findById(delivered.get???()).ifPresent(message->{
            
            message // do something
            repository().save(message);


         });
        */

        
    }
    public static void receiveMessage(PickedDelivery pickedDelivery){

        /** Example 1:  new item 
        Message message = new Message();
        repository().save(message);

        */

        /** Example 2:  finding and process
        
        repository().findById(pickedDelivery.get???()).ifPresent(message->{
            
            message // do something
            repository().save(message);


         });
        */

        
    }
    public static void receiveMessage(EndedCooking endedCooking){

        /** Example 1:  new item 
        Message message = new Message();
        repository().save(message);

        */

        /** Example 2:  finding and process
        
        repository().findById(endedCooking.get???()).ifPresent(message->{
            
            message // do something
            repository().save(message);


         });
        */

        
    }
    public static void receiveMessage(CompletedPayment completedPayment){

        /** Example 1:  new item 
        Message message = new Message();
        repository().save(message);

        */

        /** Example 2:  finding and process
        
        repository().findById(completedPayment.get???()).ifPresent(message->{
            
            message // do something
            repository().save(message);


         });
        */

        
    }
    public static void receiveMessage(PlacedOrder placedOrder){

        /** Example 1:  new item 
        Message message = new Message();
        repository().save(message);

        */

        /** Example 2:  finding and process
        
        repository().findById(placedOrder.get???()).ifPresent(message->{
            
            message // do something
            repository().save(message);


         });
        */

        
    }
    public static void receiveMessage(CanceledOrder canceledOrder){

        /** Example 1:  new item 
        Message message = new Message();
        repository().save(message);

        */

        /** Example 2:  finding and process
        
        repository().findById(canceledOrder.get???()).ifPresent(message->{
            
            message // do something
            repository().save(message);


         });
        */

        
    }


}

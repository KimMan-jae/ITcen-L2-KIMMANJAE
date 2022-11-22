package itcen.l.kimmanjae.domain;

import itcen.l.kimmanjae.domain.CompletedPayment;
import itcen.l.kimmanjae.domain.RefundedPayment;
import itcen.l.kimmanjae.PaymentApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Payment_table")
@Data

public class Payment  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private String id;
    
    
    
    
    
    private String orderId;
    
    
    
    
    
    private String customerId;
    
    
    
    
    
    private String menuId;
    
    
    
    
    
    private String qty;
    
    
    
    
    
    private String address;
    
    
    
    
    
    private String message;

    @PostPersist
    public void onPostPersist(){


        CompletedPayment completedPayment = new CompletedPayment(this);
        completedPayment.publishAfterCommit();



        RefundedPayment refundedPayment = new RefundedPayment(this);
        refundedPayment.publishAfterCommit();

    }

    public static PaymentRepository repository(){
        PaymentRepository paymentRepository = PaymentApplication.applicationContext.getBean(PaymentRepository.class);
        return paymentRepository;
    }




    public static void cancelPayment(CanceledOrder canceledOrder){

        /** Example 1:  new item 
        Payment payment = new Payment();
        repository().save(payment);

        */

        /** Example 2:  finding and process
        
        repository().findById(canceledOrder.get???()).ifPresent(payment->{
            
            payment // do something
            repository().save(payment);


         });
        */

        
    }
    public static void cancelPayment(RefusedOrder refusedOrder){

        /** Example 1:  new item 
        Payment payment = new Payment();
        repository().save(payment);

        */

        /** Example 2:  finding and process
        
        repository().findById(refusedOrder.get???()).ifPresent(payment->{
            
            payment // do something
            repository().save(payment);


         });
        */

        
    }
    public static void setCoupon(UsedCoupon usedCoupon){

        /** Example 1:  new item 
        Payment payment = new Payment();
        repository().save(payment);

        */

        /** Example 2:  finding and process
        
        repository().findById(usedCoupon.get???()).ifPresent(payment->{
            
            payment // do something
            repository().save(payment);


         });
        */

        
    }
    public static void placedBasket(PlacedOrder placedOrder){

        /** Example 1:  new item 
        Payment payment = new Payment();
        repository().save(payment);

        */

        /** Example 2:  finding and process
        
        repository().findById(placedOrder.get???()).ifPresent(payment->{
            
            payment // do something
            repository().save(payment);


         });
        */

        
    }


}

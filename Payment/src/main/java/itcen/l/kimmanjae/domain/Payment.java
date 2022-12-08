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
    
    public String getOrderId()
    {
        retrun orderId;
    }
    
    public void setOrderId(String value)
    {
        orderId = value;
    }
    
    private String customerId;
    
    
    
    
    
    private String menuId;
    
    
    
    
    
    private String qty;
    
    public String getQty()
    {
        retrun qty;
    }
    
    public void setQty(String value)
    {
        qty = value;
    }
    
    private String address;
    
    
    
    
    
    private String message;
    
    
    
    
    
    private String couponId;

    public String getCouponId()
    {
        retrun couponId;
    }
    
    public void setCouponId(String value)
    {
        couponId = value;
    }

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

        Payment payment = new Payment();
        payment.setOrderId(canceledOrder.getId());
        payment.setQty(-canceledOrder.getQty());
        repository().save(payment);


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

        repository.findByMenuId(usedCoupon.getMenuId()).ifPresent(payment->{
            payment.setCouponId(usedCoupon.getCouponId());
            repository().save(payment);
        });
        
    }
    public static void placedBasket(PlacedOrder placedOrder){

        Payment payment = new Payment();
        payment.setOrderId(placedOrder.getId());
        repository().save(payment);


        /** Example 2:  finding and process
        
        repository().findById(placedOrder.get???()).ifPresent(payment->{
            
            payment // do something
            repository().save(payment);


         });
        */

        
    }


}

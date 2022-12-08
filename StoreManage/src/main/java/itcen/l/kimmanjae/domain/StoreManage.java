package itcen.l.kimmanjae.domain;

import itcen.l.kimmanjae.domain.IssuedCoupon;
import itcen.l.kimmanjae.domain.StartedCooking;
import itcen.l.kimmanjae.domain.EndedCooking;
import itcen.l.kimmanjae.domain.RefusedOrder;
import itcen.l.kimmanjae.domain.AcceptedOrder;
import itcen.l.kimmanjae.StoreManageApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="StoreManage_table")
@Data

public class StoreManage  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private String id;
    
    
    
    
    
    private String orderId;
    
    
    
    
    
    private String menuId;
    
    
    
    
    
    private Integer qty;
    
    
    
    
    
    private String address;
    
    
    
    
    
    private String message;
    
    
    
    
    
    private String customerAddress;

    @PostPersist
    public void onPostPersist(){


        IssuedCoupon issuedCoupon = new IssuedCoupon(this);
        issuedCoupon.publishAfterCommit();


        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.

        itcen.l.kimmanjae.external.CancelOrderCommand cancelOrderCommand = new itcen.l.kimmanjae.external.CancelOrderCommand();
        cancelOrderCommand.setOrderId(getOrderId());
        
        // mappings goes here
        StoreManageApplication.applicationContext.getBean(itcen.l.kimmanjae.external.OrderService.class)
            .cancelOrder(string.valueOf(getOrderId()), cancelOrderCommand);



        StartedCooking startedCooking = new StartedCooking(this);
        startedCooking.publishAfterCommit();



        EndedCooking endedCooking = new EndedCooking(this);
        endedCooking.publishAfterCommit();



        RefusedOrder refusedOrder = new RefusedOrder(this);
        refusedOrder.publishAfterCommit();



        AcceptedOrder acceptedOrder = new AcceptedOrder(this);
        acceptedOrder.publishAfterCommit();

        // Get request from Order
        //itcen.l.kimmanjae.external.Order order =
        //    Application.applicationContext.getBean(itcen.l.kimmanjae.external.OrderService.class)
        //    .getOrder(/** mapping value needed */);

    }
    @PreRemove
    public void onPreRemove(){
        RefusedOrder refusedOrder = new RefusedOrder(this);
        refusedOrder.publishAfterCommit();
    }

    public static StoreManageRepository repository(){
        StoreManageRepository storeManageRepository = StoreManageApplication.applicationContext.getBean(StoreManageRepository.class);
        return storeManageRepository;
    }




    public static void receiveOrder(CompletedPayment completedPayment){

        /** Example 1:  new item 
        StoreManage storeManage = new StoreManage();
        repository().save(storeManage);

        */

        /** Example 2:  finding and process
        
        repository().findById(completedPayment.get???()).ifPresent(storeManage->{
            
            storeManage // do something
            repository().save(storeManage);


         });
        */

        
    }


}

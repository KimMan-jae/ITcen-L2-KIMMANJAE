package itcen.l.kimmanjae.domain;

import itcen.l.kimmanjae.domain.PlacedOrder;
import itcen.l.kimmanjae.domain.CanceledOrder;
import itcen.l.kimmanjae.OrderApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Order_table")
@Data

public class Order  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private String id;
    
    
    
    
    
    private String customerId;
    
    
    
    
    
    private String menuId;
    
    
    
    
    
    private Integer qty;
    
    
    
    
    
    private String address;
    
    
    
    
    
    private String message;

    @PostPersist
    public void onPostPersist(){


        PlacedOrder placedOrder = new PlacedOrder(this);
        placedOrder.publishAfterCommit();



        CanceledOrder canceledOrder = new CanceledOrder(this);
        canceledOrder.publishAfterCommit();

    }

    public static OrderRepository repository(){
        OrderRepository orderRepository = OrderApplication.applicationContext.getBean(OrderRepository.class);
        return orderRepository;
    }




    public static void changeStatus(ChangedStatus changedStatus){

        /** Example 1:  new item 
        Order order = new Order();
        repository().save(order);

        */

        /** Example 2:  finding and process
        
        repository().findById(changedStatus.get???()).ifPresent(order->{
            
            order // do something
            repository().save(order);


         });
        */

        
    }


}

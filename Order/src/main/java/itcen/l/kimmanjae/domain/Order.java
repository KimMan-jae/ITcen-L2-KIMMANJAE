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






}

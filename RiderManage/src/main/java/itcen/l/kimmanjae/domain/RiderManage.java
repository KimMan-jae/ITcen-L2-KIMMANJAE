package itcen.l.kimmanjae.domain;

import itcen.l.kimmanjae.domain.Delivered;
import itcen.l.kimmanjae.domain.CatchedFood;
import itcen.l.kimmanjae.domain.PickedDelivery;
import itcen.l.kimmanjae.RiderManageApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="RiderManage_table")
@Data

public class RiderManage  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private String id;
    
    
    
    
    
    private String storeId;
    
    
    
    
    
    private String orderId;
    
    
    
    
    
    private String menuId;
    
    
    
    
    
    private String qty;
    
    
    
    
    
    private String customerAddress;
    
    
    
    
    
    private String storeAddress;
    
    
    
    
    
    private String message;

    @PostPersist
    public void onPostPersist(){


        Delivered delivered = new Delivered(this);
        delivered.publishAfterCommit();



        CatchedFood catchedFood = new CatchedFood(this);
        catchedFood.publishAfterCommit();



        PickedDelivery pickedDelivery = new PickedDelivery(this);
        pickedDelivery.publishAfterCommit();

    }

    public static RiderManageRepository repository(){
        RiderManageRepository riderManageRepository = RiderManageApplication.applicationContext.getBean(RiderManageRepository.class);
        return riderManageRepository;
    }




    public static void recieveDelivery(StartedCooking startedCooking){

        /** Example 1:  new item 
        RiderManage riderManage = new RiderManage();
        repository().save(riderManage);

        */

        /** Example 2:  finding and process
        
        repository().findById(startedCooking.get???()).ifPresent(riderManage->{
            
            riderManage // do something
            repository().save(riderManage);


         });
        */

        
    }


}

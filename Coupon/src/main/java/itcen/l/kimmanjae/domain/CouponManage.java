package itcen.l.kimmanjae.domain;

import itcen.l.kimmanjae.domain.UsedCoupon;
import itcen.l.kimmanjae.CouponApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="CouponManage_table")
@Data

public class CouponManage  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private String id;
    
    
    
    
    
    private String storeId;
    
    
    
    
    
    private String orderId;
    
    
    
    
    
    private String menuId;
    
    
    
    
    
    private String qty;

    @PostPersist
    public void onPostPersist(){


        UsedCoupon usedCoupon = new UsedCoupon(this);
        usedCoupon.publishAfterCommit();

    }

    public static CouponManageRepository repository(){
        CouponManageRepository couponManageRepository = CouponApplication.applicationContext.getBean(CouponManageRepository.class);
        return couponManageRepository;
    }




    public static void receiveCoupon(IssuedCoupon issuedCoupon){

        /** Example 1:  new item 
        CouponManage couponManage = new CouponManage();
        repository().save(couponManage);

        */

        /** Example 2:  finding and process
        
        repository().findById(issuedCoupon.get???()).ifPresent(couponManage->{
            
            couponManage // do something
            repository().save(couponManage);


         });
        */

        
    }


}

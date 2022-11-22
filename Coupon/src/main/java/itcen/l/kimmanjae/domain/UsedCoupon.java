package itcen.l.kimmanjae.domain;

import itcen.l.kimmanjae.domain.*;
import itcen.l.kimmanjae.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class UsedCoupon extends AbstractEvent {

    private String id;
    private String storeId;
    private String orderId;
    private String menuId;
    private String qty;

    public UsedCoupon(CouponManage aggregate){
        super(aggregate);
    }
    public UsedCoupon(){
        super();
    }
}

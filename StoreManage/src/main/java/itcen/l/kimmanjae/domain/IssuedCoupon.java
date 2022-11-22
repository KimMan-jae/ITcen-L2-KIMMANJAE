package itcen.l.kimmanjae.domain;

import itcen.l.kimmanjae.domain.*;
import itcen.l.kimmanjae.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class IssuedCoupon extends AbstractEvent {

    private String id;
    private String orderId;
    private String menuId;
    private String qty;

    public IssuedCoupon(StoreManage aggregate){
        super(aggregate);
    }
    public IssuedCoupon(){
        super();
    }
}

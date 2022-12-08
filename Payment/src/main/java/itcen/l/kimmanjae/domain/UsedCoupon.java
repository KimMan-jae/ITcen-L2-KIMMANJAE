package itcen.l.kimmanjae.domain;

import itcen.l.kimmanjae.domain.*;
import itcen.l.kimmanjae.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class UsedCoupon extends AbstractEvent {

    private String id;
    private String storeId;
    private String orderId;
    private String menuId;
    private String qty;

    public String getId(){
    return id;
    }

    public String getOrderId(){
    return orderId;
    }
}



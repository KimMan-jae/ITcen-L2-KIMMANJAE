package itcen.l.kimmanjae.domain;

import itcen.l.kimmanjae.domain.*;
import itcen.l.kimmanjae.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class EndedCooking extends AbstractEvent {

    private String id;
    private String orderId;
    private String menuId;
    private String qty;
    private String address;
    private String message;

    public EndedCooking(StoreManage aggregate){
        super(aggregate);
    }
    public EndedCooking(){
        super();
    }
}

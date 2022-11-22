package itcen.l.kimmanjae.domain;

import itcen.l.kimmanjae.domain.*;
import itcen.l.kimmanjae.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class StartedCooking extends AbstractEvent {

    private String id;
    private String orderId;
    private String menuId;
    private String qty;
    private String address;
    private String message;
    private String customerAddress;

    public StartedCooking(StoreManage aggregate){
        super(aggregate);
    }
    public StartedCooking(){
        super();
    }
}

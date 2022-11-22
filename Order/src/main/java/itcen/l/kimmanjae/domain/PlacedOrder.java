package itcen.l.kimmanjae.domain;

import itcen.l.kimmanjae.domain.*;
import itcen.l.kimmanjae.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class PlacedOrder extends AbstractEvent {

    private String id;
    private String customerId;
    private String menuId;
    private Integer qty;
    private String address;
    private String message;

    public PlacedOrder(Order aggregate){
        super(aggregate);
    }
    public PlacedOrder(){
        super();
    }
}

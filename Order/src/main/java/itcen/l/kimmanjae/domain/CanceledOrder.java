package itcen.l.kimmanjae.domain;

import itcen.l.kimmanjae.domain.*;
import itcen.l.kimmanjae.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CanceledOrder extends AbstractEvent {

    private String id;
    private String customerId;
    private String menuId;
    private Integer qty;
    private String address;
    private String message;

    public CanceledOrder(Order aggregate){
        super(aggregate);
    }
    public CanceledOrder(){
        super();
    }
}

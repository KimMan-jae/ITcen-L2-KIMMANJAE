package itcen.l.kimmanjae.domain;

import itcen.l.kimmanjae.domain.*;
import itcen.l.kimmanjae.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class RefundedPayment extends AbstractEvent {

    private String id;
    private String orderId;
    private String customerId;
    private String menuId;
    private String qty;
    private String address;
    private String message;

    public RefundedPayment(Payment aggregate){
        super(aggregate);
    }
    public RefundedPayment(){
        super();
    }
}

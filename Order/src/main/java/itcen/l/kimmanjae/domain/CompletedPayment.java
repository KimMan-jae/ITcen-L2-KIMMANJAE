package itcen.l.kimmanjae.domain;

import itcen.l.kimmanjae.infra.AbstractEvent;
import lombok.Data;
import java.util.*;

@Data
public class CompletedPayment extends AbstractEvent {

    private String id;
    private String orderId;
    private String customerId;
    private String menuId;
    private String qty;
    private String Address;
    private String message;
}

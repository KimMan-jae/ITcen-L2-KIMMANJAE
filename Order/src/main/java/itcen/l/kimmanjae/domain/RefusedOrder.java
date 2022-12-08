package itcen.l.kimmanjae.domain;

import itcen.l.kimmanjae.infra.AbstractEvent;
import lombok.Data;
import java.util.*;

@Data
public class RefusedOrder extends AbstractEvent {

    private String id;
    private String orderId;
    private String menuId;
    private String qty;
    private String address;
    private String message;
}

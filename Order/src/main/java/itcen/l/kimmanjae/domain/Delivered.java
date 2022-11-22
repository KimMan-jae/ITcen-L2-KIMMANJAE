package itcen.l.kimmanjae.domain;

import itcen.l.kimmanjae.infra.AbstractEvent;
import lombok.Data;
import java.util.*;

@Data
public class Delivered extends AbstractEvent {

    private String id;
    private String storeId;
    private String orderId;
    private String menuId;
    private String qty;
    private String customerAddress;
    private String storeAddress;
    private String message;
}

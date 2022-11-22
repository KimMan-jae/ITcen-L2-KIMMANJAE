package itcen.l.kimmanjae.domain;

import itcen.l.kimmanjae.domain.*;
import itcen.l.kimmanjae.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class CatchedFood extends AbstractEvent {

    private String id;
    private String storeId;
    private String orderId;
    private String menuId;
    private String qty;
    private String customerAddress;
    private String storeAddress;
    private String message;
}



package itcen.l.kimmanjae.domain;

import itcen.l.kimmanjae.infra.AbstractEvent;
import lombok.Data;
import java.util.*;

@Data
public class PlacedOrder extends AbstractEvent {

    private String id;
    private String customerId;
    private String menuId;
    private Integer qty;
    private String address;
    private String message;
}

package itcen.l.kimmanjae.domain;

import itcen.l.kimmanjae.domain.*;
import itcen.l.kimmanjae.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class ChangedStatus extends AbstractEvent {

    private String id;
    private String orderId;
    private String customerId;
    private String storeId;
    private String riderId;
    private String publisher;
    private String message;
}



package itcen.l.kimmanjae.domain;

import itcen.l.kimmanjae.domain.*;
import itcen.l.kimmanjae.infra.AbstractEvent;
import java.util.*;
import lombok.*;

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

    public ChangedStatus(Message aggregate){
        super(aggregate);
    }
    public ChangedStatus(){
        super();
    }
}

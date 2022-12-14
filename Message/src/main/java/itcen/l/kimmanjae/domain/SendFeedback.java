package itcen.l.kimmanjae.domain;

import itcen.l.kimmanjae.domain.*;
import itcen.l.kimmanjae.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class SendFeedback extends AbstractEvent {

    private String id;
    private String publisher;
    private String message;
    private String orderId;
    private String customerId;
    private String storeId;
    private String riderId;

    public SendFeedback(Message aggregate){
        super(aggregate);
    }
    public SendFeedback(){
        super();
    }
}

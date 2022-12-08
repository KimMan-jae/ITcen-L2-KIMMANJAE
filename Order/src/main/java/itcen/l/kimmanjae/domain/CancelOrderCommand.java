package itcen.l.kimmanjae.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;

@Data
public class CancelOrderCommand {

        private String orderId;


}

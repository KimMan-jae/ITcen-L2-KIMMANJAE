package itcen.l.kimmanjae.external;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;

@Data
public class CancelOrderCommand {

    private String orderId;
}

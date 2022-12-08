package itcen.l.kimmanjae.external;

import lombok.Data;
import java.util.Date;
@Data
public class Order {

    private String id;
    private String customerId;
    private String menuId;
    private Integer qty;
    private String address;
    private String message;
}



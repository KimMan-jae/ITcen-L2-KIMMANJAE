package itcen.l.kimmanjae.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;

@Entity
@Table(name="OrderStatus_table")
@Data
public class OrderStatus {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private String id;


        @Message
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private String message;
}
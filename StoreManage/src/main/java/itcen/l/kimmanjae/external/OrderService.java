package itcen.l.kimmanjae.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Service;

import java.util.Date;

@FeignClient(name = "Order", url = "${api.url.Order}", fallback = OrderServiceFallback.class)
public interface OrderService {
    @RequestMapping(method= RequestMethod.GET, path="/orders/{id}")
    public Order getOrder(@PathVariable("id") String id, Integer qty);
}

@Service
public class OrderServiceFallback implements OrderService{
    public Order getOrder(String id, Integer qty){
        Order fallbackValue = new Order();
        fallbackValue.setQty(-qty);

        return fallbackValue;
    }
}

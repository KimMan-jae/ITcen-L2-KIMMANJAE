package itcen.l.kimmanjae.infra;

import itcen.l.kimmanjae.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel="orderDetails", path="orderDetails")
public interface OrderDetailRepository extends PagingAndSortingRepository<OrderDetail, Long> {

    

    
}

package itcen.l.kimmanjae.domain;

import itcen.l.kimmanjae.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="riderManages", path="riderManages")
public interface RiderManageRepository extends PagingAndSortingRepository<RiderManage, String>{

}

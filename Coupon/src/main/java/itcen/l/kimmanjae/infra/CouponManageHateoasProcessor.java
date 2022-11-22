package itcen.l.kimmanjae.infra;
import itcen.l.kimmanjae.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class CouponManageHateoasProcessor implements RepresentationModelProcessor<EntityModel<CouponManage>>  {

    @Override
    public EntityModel<CouponManage> process(EntityModel<CouponManage> model) {

        
        return model;
    }
    
}

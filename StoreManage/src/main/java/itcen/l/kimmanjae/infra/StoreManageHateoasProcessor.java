package itcen.l.kimmanjae.infra;
import itcen.l.kimmanjae.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class StoreManageHateoasProcessor implements RepresentationModelProcessor<EntityModel<StoreManage>>  {

    @Override
    public EntityModel<StoreManage> process(EntityModel<StoreManage> model) {

        
        return model;
    }
    
}

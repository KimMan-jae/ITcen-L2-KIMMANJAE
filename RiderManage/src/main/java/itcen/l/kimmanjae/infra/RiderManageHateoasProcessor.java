package itcen.l.kimmanjae.infra;
import itcen.l.kimmanjae.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class RiderManageHateoasProcessor implements RepresentationModelProcessor<EntityModel<RiderManage>>  {

    @Override
    public EntityModel<RiderManage> process(EntityModel<RiderManage> model) {

        
        return model;
    }
    
}

package ramen.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import ramen.domain.*;

@Component
public class RamenOrderHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<RamenOrder>> {

    @Override
    public EntityModel<RamenOrder> process(EntityModel<RamenOrder> model) {
        return model;
    }
}

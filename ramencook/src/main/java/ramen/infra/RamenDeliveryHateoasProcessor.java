package ramen.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import ramen.domain.*;

@Component
public class RamenDeliveryHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<RamenDelivery>> {

    @Override
    public EntityModel<RamenDelivery> process(
        EntityModel<RamenDelivery> model
    ) {
        return model;
    }
}

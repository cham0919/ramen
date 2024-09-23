package ramen.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import ramen.domain.*;
import ramen.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class CancelCookRamenRequest extends AbstractEvent {

    private Long id;
    private String ramen;
    private String amount;
    private String address;
    private String cost;

    public CancelCookRamenRequest(RamenDelivery aggregate) {
        super(aggregate);
    }

    public CancelCookRamenRequest() {
        super();
    }
}
//>>> DDD / Domain Event

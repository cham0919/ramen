package ramen.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import ramen.domain.*;
import ramen.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class RamenOrdered extends AbstractEvent {

    private Long id;
    private String userId;
    private String ramen;
    private String amount;
    private String address;
    private String cost;
    private String user;

    public RamenOrdered(RamenOrder aggregate) {
        super(aggregate);
    }

    public RamenOrdered() {
        super();
    }
}
//>>> DDD / Domain Event

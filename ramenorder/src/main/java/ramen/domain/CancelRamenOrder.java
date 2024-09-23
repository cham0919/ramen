package ramen.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import ramen.domain.*;
import ramen.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class CancelRamenOrder extends AbstractEvent {

    private Long id;
    private String userId;
    private String orderId;
    private String ramen;
    private String amount;
    private String address;
    private String cost;

    public CancelRamenOrder(RamenOrder aggregate) {
        super(aggregate);
    }

    public CancelRamenOrder() {
        super();
    }
}
//>>> DDD / Domain Event

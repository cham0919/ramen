package ramen.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import ramen.domain.*;
import ramen.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class CancelRamenDelivery extends AbstractEvent {

    private Long id;
    private String orderId;
    private String ramen;
    private String amount;
    private String address;
    private String cost;
    private String deliveryStatus;

    public CancelRamenDelivery(Delivery aggregate) {
        super(aggregate);
    }

    public CancelRamenDelivery() {
        super();
    }
}
//>>> DDD / Domain Event

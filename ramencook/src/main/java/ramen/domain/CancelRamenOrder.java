package ramen.domain;

import java.util.*;
import lombok.*;
import ramen.domain.*;
import ramen.infra.AbstractEvent;

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
}

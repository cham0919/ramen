package ramen.domain;

import java.util.*;
import lombok.*;
import ramen.domain.*;
import ramen.infra.AbstractEvent;

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
}

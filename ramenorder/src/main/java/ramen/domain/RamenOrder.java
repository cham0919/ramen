package ramen.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import ramen.RamenorderApplication;

@Entity
@Table(name = "RamenOrder_table")
@Data
//<<< DDD / Aggregate Root
public class RamenOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userId;

    private String orderId;

    private String ramen;

    private String amount;

    private String address;

    private String cost;

    public static RamenOrderRepository repository() {
        RamenOrderRepository ramenOrderRepository = RamenorderApplication.applicationContext.getBean(
            RamenOrderRepository.class
        );
        return ramenOrderRepository;
    }

    public void orderRamen() {
        //implement business logic here:

    }

    public void cancelOrderRamen() {
        //implement business logic here:

    }
}
//>>> DDD / Aggregate Root

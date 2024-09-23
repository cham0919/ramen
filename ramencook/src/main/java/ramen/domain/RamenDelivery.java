package ramen.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import ramen.RamencookApplication;

@Entity
@Table(name = "RamenDelivery_table")
@Data
//<<< DDD / Aggregate Root
public class RamenDelivery {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String ramen;

    private String amount;

    private String address;

    private String cost;

    public static RamenDeliveryRepository repository() {
        RamenDeliveryRepository ramenDeliveryRepository = RamencookApplication.applicationContext.getBean(
            RamenDeliveryRepository.class
        );
        return ramenDeliveryRepository;
    }

    public void finishRamenCook() {
        //implement business logic here:

    }

    //<<< Clean Arch / Port Method
    public static void requestCookRamen(RamenOrdered ramenOrdered) {
        //implement business logic here:

        /** Example 1:  new item 
        RamenDelivery ramenDelivery = new RamenDelivery();
        repository().save(ramenDelivery);

        */

        /** Example 2:  finding and process
        
        repository().findById(ramenOrdered.get???()).ifPresent(ramenDelivery->{
            
            ramenDelivery // do something
            repository().save(ramenDelivery);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void cancelRequestCookRamen(
        CancelRamenOrder cancelRamenOrder
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        RamenDelivery ramenDelivery = new RamenDelivery();
        repository().save(ramenDelivery);

        */

        /** Example 2:  finding and process
        
        repository().findById(cancelRamenOrder.get???()).ifPresent(ramenDelivery->{
            
            ramenDelivery // do something
            repository().save(ramenDelivery);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root

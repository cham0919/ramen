package ramen.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import ramen.config.kafka.KafkaProcessor;
import ramen.domain.*;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='RamenOrdered'"
    )
    public void wheneverRamenOrdered_RequestCookRamen(
        @Payload RamenOrdered ramenOrdered
    ) {
        RamenOrdered event = ramenOrdered;
        System.out.println(
            "\n\n##### listener RequestCookRamen : " + ramenOrdered + "\n\n"
        );

        // Sample Logic //
        RamenDelivery.requestCookRamen(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='CancelRamenOrder'"
    )
    public void wheneverCancelRamenOrder_CancelRequestCookRamen(
        @Payload CancelRamenOrder cancelRamenOrder
    ) {
        CancelRamenOrder event = cancelRamenOrder;
        System.out.println(
            "\n\n##### listener CancelRequestCookRamen : " +
            cancelRamenOrder +
            "\n\n"
        );

        // Sample Logic //
        RamenDelivery.cancelRequestCookRamen(event);
    }
}
//>>> Clean Arch / Inbound Adaptor

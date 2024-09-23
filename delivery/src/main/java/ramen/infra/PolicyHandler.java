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
        condition = "headers['type']=='RamenDeliveryRequst'"
    )
    public void wheneverRamenDeliveryRequst_RequsetDelivery(
        @Payload RamenDeliveryRequst ramenDeliveryRequst
    ) {
        RamenDeliveryRequst event = ramenDeliveryRequst;
        System.out.println(
            "\n\n##### listener RequsetDelivery : " +
            ramenDeliveryRequst +
            "\n\n"
        );

        // Sample Logic //
        Delivery.requsetDelivery(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='CancelCookRamenRequest'"
    )
    public void wheneverCancelCookRamenRequest_CancelRequestDelivery(
        @Payload CancelCookRamenRequest cancelCookRamenRequest
    ) {
        CancelCookRamenRequest event = cancelCookRamenRequest;
        System.out.println(
            "\n\n##### listener CancelRequestDelivery : " +
            cancelCookRamenRequest +
            "\n\n"
        );

        // Sample Logic //
        Delivery.cancelRequestDelivery(event);
    }
}
//>>> Clean Arch / Inbound Adaptor

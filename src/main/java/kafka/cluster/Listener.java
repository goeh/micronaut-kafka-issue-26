package kafka.cluster;

import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;

@KafkaListener
@Topic("test")
public class Listener {

    public void handleMessage(@KafkaKey String key, String message) {
        // Handle message.
    }
}

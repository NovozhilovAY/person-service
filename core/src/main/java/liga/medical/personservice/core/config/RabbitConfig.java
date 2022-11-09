package liga.medical.personservice.core.config;

import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    public static final String ALERT_QUEUE_NAME = "alert_queue";

    public static final String DAILY_QUEUE_NAME = "daily_queue";
    private static final String HOST = "localhost";

    @Bean
    public ConnectionFactory connectionFactory() {
        return new CachingConnectionFactory(HOST);
    }

    @Bean
    public AmqpAdmin amqpAdmin() {
        return new RabbitAdmin(connectionFactory());
    }

    @Bean
    public RabbitTemplate rabbitTemplate() {
        return new RabbitTemplate(connectionFactory());
    }

    @Bean("dailyQueue")
    public Queue getDailyQueue() {
        return new Queue(DAILY_QUEUE_NAME);
    }

    @Bean("alertQueue")
    public Queue getAlertQueue() {
        return new Queue(ALERT_QUEUE_NAME);
    }
}

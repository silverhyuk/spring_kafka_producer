package com.cafe24.spring_kafka_producer.runner;

import com.cafe24.spring_kafka_producer.service.Sender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaRunner implements ApplicationRunner {

    private static final Logger LOG = LoggerFactory.getLogger(KafkaRunner.class);

    @Autowired
    Sender sender;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        sender.send("Test Message");
    }
}

package com.learning.kafkaconsumerdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaconsumerdemoApplication implements ApplicationRunner {
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	@Value(value = "${message.topic.name}")
	private String topic;

	public static void main(String[] args) {
		SpringApplication.run(KafkaconsumerdemoApplication.class, args);
	}

	@KafkaListener(topics = "kafka-demo-topic1")
	public void listen(String message) {
		System.out.println("Received Messasge in group - group-id: " + message);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {

	}
}

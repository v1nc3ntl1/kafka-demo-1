package com.learning.kafkademo;

import com.learning.kafkademo.application.Producer;
import com.learning.kafkademo.constants.Common;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.Scanner;

@SpringBootApplication
public class KafkademoApplication implements ApplicationRunner {
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	@Value(value = "${message.topic.name}")
	private String topic;

	public static void main(String[] args) {
		SpringApplication.run(KafkademoApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		while(true){
			System.out.println("Please enter message: ");
			String message = scanner.nextLine();
			kafkaTemplate.send("kafka-demo-topic1", message);
		}
	}

}

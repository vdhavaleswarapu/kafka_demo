package com.kafka.demo;


import com.kafka.demo.controller.TransactionController;
import java.util.Properties;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootjpaApplication {

	private static final Logger log = LoggerFactory.getLogger(BootjpaApplication.class.getSimpleName());

	public static void main(String[] args) {

		SpringApplication.run(BootjpaApplication.class, args);

//		TransactionController kafkaMessage = new TransactionController();
//		String message = kafkaMessage.getKafkaMessage();
//		System.out.println("Message is"+message);

}

//

}


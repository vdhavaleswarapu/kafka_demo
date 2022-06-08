package com.kafka.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootjpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootjpaApplication.class, args);
	}

	//Producer properties
//    Properties properties = new Properties();
//    properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,"127.0.0.1:9092");
//    properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
//    properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,StringSerializer.class.getName());
//
//    //Creating a producer
//    KafkaProducer<String, String> producer = new KafkaProducer<String, String>(properties);
//
//    //Create a producer record
//    ProducerRecord<String, String> producerRecord = new ProducerRecord<>("demo_kafka","Houston, we have a problem!");
//
//    //Sending data async
//    producer.send(producerRecord);
//
//    //flush and close
//    producer.flush();
//    producer.close();

}


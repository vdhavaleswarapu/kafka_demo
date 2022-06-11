package com.kafka.demo;


import com.kafka.demo.controller.TransactionController;
import java.util.Locale;
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

	public static KafkaProducer<String, String> createProducer(){

		//		Producer properties
		Properties properties = new Properties();
		properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,"127.0.0.1:9092");
		properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,StringSerializer.class.getName());

		//Creating a producer
		return new KafkaProducer<String, String>(properties);
	}

	public static void main(String[] args) {

		SpringApplication.run(BootjpaApplication.class, args);

		}
}


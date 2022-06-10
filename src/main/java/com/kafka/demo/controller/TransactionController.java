package com.kafka.demo.controller;

import com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;
import com.kafka.demo.BootjpaApplication;
import com.kafka.demo.dao.CustomerRepo;
import com.kafka.demo.model.BaseData;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kafka.demo.dao.TransactionRepo;
import com.kafka.demo.model.TransactionRecord;

@Controller
public class TransactionController
{

	@Autowired
	TransactionRepo repo;
	@Autowired
	CustomerRepo auth;


	private String kafkaMessage;
	public String getKafkaMessage(){return this.kafkaMessage;}

	@RequestMapping("/")
	public String home()
	{
		Properties properties = new Properties();
		properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,"127.0.0.1:9092");
		properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,StringSerializer.class.getName());

		//Creating a producer
		KafkaProducer<String, String> producer = new KafkaProducer<String, String>(properties);

		return "home.jsp";
	}
	@RequestMapping("/transaction")
	public String addTransaction(final int amt, final String senderID, final String receiverID,final String key, final String currency)
	{

		List<BaseData> temp= new ArrayList<>(); //Using a temp variable to validate auth checks for sender
		List<BaseData> receiver= new ArrayList<>(); //Using a temp variable for receiver data
		auth.findBycIDAndPin(senderID.toUpperCase(Locale.ROOT), key).forEach(i->temp.add(i)); //verifying that the senderID corresponds to the sender's PIN
		auth.findBycID(receiverID.toUpperCase(Locale.ROOT)).forEach(i->receiver.add(i));


		if(!temp.isEmpty() && amt>0){ //Only adding valid transactions to the transaction repo using a simple auth check on the customer PIN
			if(temp.get(0).getCreditAvailable()<amt) {
				System.out.println("Credit limit exceeded");
				return "home.jsp";
			}
			temp.get(0).setCreditAvailable(temp.get(0).getCreditAvailable()-amt);
			receiver.get(0).setCreditAvailable(receiver.get(0).getCreditAvailable()+amt);
			repo.save(new TransactionRecord(amt, senderID,receiverID,key, currency));
		}
		else System.out.println("Invalid PIN. Retry.");

		//		Producer properties

		Properties properties = new Properties();
		properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,"127.0.0.1:9092");
		properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,StringSerializer.class.getName());

		//Creating a producer
		KafkaProducer<String, String> producer = new KafkaProducer<String, String>(properties);
//
		//Create a producer record
		ProducerRecord<String, String>
				producerRecord = new ProducerRecord<>("demo_kafka",amt+" "+ currency+" transferred from "+senderID.toUpperCase(
				Locale.ROOT) +" to "+receiverID.toUpperCase(Locale.ROOT));

//		kafkaMessage = amt+" "+ currency+" transferred from "+senderID.toUpperCase(
//				Locale.ROOT) +" to "+receiverID.toUpperCase(Locale.ROOT);

		//Sending data async
		producer.send(producerRecord);

		//flush and close
		producer.flush();
		producer.close();

		return "home.jsp";
	}
}

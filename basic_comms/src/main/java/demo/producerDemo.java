package demo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import java.util.Properties;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RequiredArgsConstructor
@Slf4j
@SpringBootApplication
public class producerDemo implements ApplicationRunner {

  private static final Logger log = LoggerFactory.getLogger(producerDemo.class.getSimpleName());

  public static void main(String[] args) {
    SpringApplication.run(producerDemo.class, args);
    log.info("Hello World");

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

  @Override
  public void run(ApplicationArguments args) throws Exception {
    
  }
}

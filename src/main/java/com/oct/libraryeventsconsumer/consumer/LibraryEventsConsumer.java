package com.oct.libraryeventsconsumer.consumer;

import lombok.extern.slf4j.Slf4j;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class LibraryEventsConsumer {

  @KafkaListener(topics = {"test_topic_kafka"}, groupId = "spring-boot-kafka")
  public void onMessage(ConsumerRecord<Integer, String> consumerRecord) {
    log.info("Consumer Record : <{}>", consumerRecord);
  }
}

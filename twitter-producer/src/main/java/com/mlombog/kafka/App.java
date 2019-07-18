package com.mlombog.kafka;

import com.google.gson.JsonSyntaxException;
import com.mlombog.kafka.producer.TwitterKafkaProducer;

public class App {
    public static void main(String[] args) throws JsonSyntaxException, InterruptedException {
        System.out.println("Hello World!");
        TwitterKafkaProducer producer = new TwitterKafkaProducer();
        producer.run();
    }
}

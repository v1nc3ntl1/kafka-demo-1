package com.learning.kafkademo.constants;

import org.springframework.beans.factory.annotation.Value;

public class Common {
    @Value(value = "${message.topic.name}")
    public static String topicName;
}

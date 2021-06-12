package com.learning.kafkaconsumerdemo.constants;

import org.springframework.beans.factory.annotation.Value;

public class Common {
    @Value(value = "${kafka-demo-topic1}")
    public static String topicName;
    public final static String groupId = "group-id";
}

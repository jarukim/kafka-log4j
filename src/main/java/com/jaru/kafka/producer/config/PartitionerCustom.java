package com.jaru.kafka.producer.config;

import org.apache.kafka.clients.producer.Partitioner;
import org.apache.kafka.common.Cluster;
import org.springframework.beans.factory.annotation.Value;

import java.util.Map;

public class PartitionerCustom implements Partitioner {
    @Value(value = "${custom.partition-idx}")
    private int partitionIdx;

    @Override
    public int partition(String s, Object o, byte[] bytes, Object o1, byte[] bytes1, Cluster cluster) {
        return partitionIdx;
    }

    @Override
    public void close() {

    }

    @Override
    public void configure(Map<String, ?> map) {

    }
}

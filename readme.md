# Intro
This repo is showing how to use apache kafka to produce message and consume message. 
There are two java spring projects file; a product and a consumer project.

# Pre-requisite
Require Apache kafka to be downloaded and extracted.

# To run
# 1. start up zookeeper.
bin/zookeeper-server-start.sh config/zookeeper.properties
bin/kafka-server-start.sh config/server.properties

# 2. create a topic
bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic kafka-demo-topic1

# 3. Run both consumer and product program.
Run from Intellij at kafkademo and kafkaconsumerdemo
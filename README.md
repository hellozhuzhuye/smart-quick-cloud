# smart-quick-cloud

### 致力于为企业和个人提供基于SpringCloud+SpringCloudAlibaba的快速搭建分布式微服务架构的开箱即用方案

### 1.2024年2月微服务架构选型

|     名称     | Spring Cloud                                  | Spring Cloud Alibaba | 最终选型               |
| :----------: | --------------------------------------------- | -------------------- | ---------------------- |
| 服务注册发现 | Eurake（停更）、Consul、Etcd                  | Nacos                | Nacos                  |
|   配置中心   | Spring Cloud Config（停更）、Consul           | Nacos                | Nacos                  |
|   服务总线   | Spring Cloud Bus（停更）                      | Nacos                | Nacos                  |
|   服务调用   | Ribbon（停更）、Spring Cloud OpenFeign        | Dubbo                | Spring Cloud OpenFeign |
|   API网关    | Zuul（停更）、Spring Cloud Gateway、          | 无                   | Spring Cloud Gateway   |
|   熔断限流   | Hystrix（停更）、Resilience4j                 | Sentinel             | Sentinel               |
|   负载均衡   | Ribbon、Spring Cloud LoadBalancer             | Nacos、Dubbo         | Nacos                  |
|   消息队列   | Spring Cloud Stream（RabbitMQ和Apache Kafka） | RocketMQ             | RocketMQ               |
|  分布式事务  | 无                                            | Seata                | Seata                  |
|   服务监控   | Spring Cloud Admin                            | 无                   | Spring Cloud Admin     |
|   短信服务   | 无                                            | Alibaba Cloud SMS    | Alibaba Cloud SMS      |
|   链路追踪   | Sleuth（停更）、Micrometer Tracing            | 无                   | Micrometer Tracing     |



### 2.模块介绍

- api-gateway：Spring Cloud Gateway 网关模块
- ms-admin：后台模块
- ms-commom：通用模块
- ms-order：订单模块


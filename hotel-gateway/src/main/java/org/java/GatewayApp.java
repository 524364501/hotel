package org.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient//启动eureka客户端
@EnableZuulProxy//启动网关
public class GatewayApp {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApp.class,args);
    }
}

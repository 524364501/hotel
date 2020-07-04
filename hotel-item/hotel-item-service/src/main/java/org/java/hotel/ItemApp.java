package org.java.hotel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableDiscoveryClient//启动eureka启动器
@MapperScan(basePackages = "org.java.hotel.item.mapper")//扫描hotel-item-interface下的Mapper接口
public class ItemApp {

    public static void main(String[] args) {
        SpringApplication.run(ItemApp.class,args);
    }
}

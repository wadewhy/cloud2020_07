package xyz.wadewhy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @PACKAGE_NAME: xyz.wadewhy.springcloud
 * @NAME: OrderHystrixMain80
 * @Author: 钟子豪
 * @DATE: 2020/5/15
 * @MONTH_NAME_FULL: 五月
 * @DAY: 15
 * @DAY_NAME_FULL: 星期五
 * @PROJECT_NAME: cloud2020_3
 **/
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class OrderHystrixMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixMain80.class,args);
    }
}


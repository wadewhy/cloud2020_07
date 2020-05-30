package xyz.wadewhy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @PACKAGE_NAME: xyz.wadewhy.springcloud
 * @NAME: OrderFeignMain80
 * @Author: 钟子豪
 * @DATE: 2020/5/14
 * @MONTH_NAME_FULL: 五月
 * @DAY: 14
 * @DAY_NAME_FULL: 星期四
 * @PROJECT_NAME: cloud2020_3
 **/
@SpringBootApplication
@EnableFeignClients
public class OrderFeignMain80 {
    public static void main(String[] args){
        SpringApplication.run(OrderFeignMain80.class, args);
    }
}

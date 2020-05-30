package xyz.wadewhy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @PACKAGE_NAME: xyz.wadewhy.springcloud
 * @NAME: PaymentMain9001
 * @Author: 钟子豪
 * @DATE: 2020/5/21
 * @MONTH_NAME_FULL: 五月
 * @DAY: 21
 * @DAY_NAME_FULL: 星期四
 * @PROJECT_NAME: cloud2020_6
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentMain9002
{
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain9002.class, args);
    }
}
package xyz.wadewhy.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @PACKAGE_NAME: xyz.wadewhy.springcloud.alibaba
 * @NAME: PaymentMain9003
 * @Author: 钟子豪
 * @DATE: 2020/5/30
 * @MONTH_NAME_FULL: 五月
 * @DAY: 30
 * @DAY_NAME_FULL: 星期六
 * @PROJECT_NAME: cloud2020_7
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9003
{
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain9003.class, args);
    }
}


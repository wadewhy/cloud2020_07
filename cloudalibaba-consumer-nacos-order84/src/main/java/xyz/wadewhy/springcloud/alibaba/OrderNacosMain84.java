package xyz.wadewhy.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @PACKAGE_NAME: xyz.wadewhy.springcloud.alibaba
 * @NAME: OrderNacosMain84
 * @Author: 钟子豪
 * @DATE: 2020/5/30
 * @MONTH_NAME_FULL: 五月
 * @DAY: 30
 * @DAY_NAME_FULL: 星期六
 * @PROJECT_NAME: cloud2020_7
 **/
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class OrderNacosMain84
{
    public static void main(String[] args) {
        SpringApplication.run(OrderNacosMain84.class, args);
    }
}

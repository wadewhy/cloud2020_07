package xyz.wadewhy.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @PACKAGE_NAME: xyz.wadewhy.springcloud
 * @NAME: MainApp8401
 * @Author: 钟子豪
 * @DATE: 2020/5/24
 * @MONTH_NAME_FULL: 五月
 * @DAY: 24
 * @DAY_NAME_FULL: 星期日
 * @PROJECT_NAME: cloud2020_7
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class MainApp8401
{
    public static void main(String[] args) {
        SpringApplication.run(MainApp8401.class, args);
    }
}


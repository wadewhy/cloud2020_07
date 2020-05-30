package xyz.wadewhy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @PACKAGE_NAME: xyz.wadewhy.springcloud
 * @NAME: NacosConfigClientMain3377
 * @Author: 钟子豪
 * @DATE: 2020/5/22
 * @MONTH_NAME_FULL: 五月
 * @DAY: 22
 * @DAY_NAME_FULL: 星期五
 * @PROJECT_NAME: cloud2020_6
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfigClientMain3377
{
    public static void main(String[] args) {
        SpringApplication.run(NacosConfigClientMain3377.class, args);
    }
}

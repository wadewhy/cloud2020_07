package xyz.wadewhy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @PACKAGE_NAME: xyz.wadewhy.springcloud
 * @NAME: GateMain9527
 * @Author: 钟子豪
 * @DATE: 2020/5/17
 * @MONTH_NAME_FULL: 五月
 * @DAY: 17
 * @DAY_NAME_FULL: 星期日
 * @PROJECT_NAME: cloud2020_4
 **/

@SpringBootApplication
@EnableEurekaClient
public class GateWayMain9527 {
    public static void main(String[] args) {
        SpringApplication.run( GateWayMain9527.class,args);
    }
}

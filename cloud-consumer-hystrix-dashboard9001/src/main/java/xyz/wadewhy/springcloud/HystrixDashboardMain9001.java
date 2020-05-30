package xyz.wadewhy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @PACKAGE_NAME: xyz.wadewhy.springcloud
 * @NAME: HystrixDashboardMain9001
 * @Author: 钟子豪
 * @DATE: 2020/5/16
 * @MONTH_NAME_FULL: 五月
 * @DAY: 16
 * @DAY_NAME_FULL: 星期六
 * @PROJECT_NAME: cloud2020_3
 **/


@SpringBootApplication
//服务监控hystrixDashboard
@EnableHystrixDashboard
public class HystrixDashboardMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardMain9001.class,args);
    }
}



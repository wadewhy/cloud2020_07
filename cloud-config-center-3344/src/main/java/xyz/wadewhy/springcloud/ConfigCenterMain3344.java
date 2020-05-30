package xyz.wadewhy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @PACKAGE_NAME: xyz.wadewhy.springcloud
 * @NAME: ConfigCenterMain3344
 * @Author: 钟子豪
 * @DATE: 2020/5/18
 * @MONTH_NAME_FULL: 五月
 * @DAY: 18
 * @DAY_NAME_FULL: 星期一
 * @PROJECT_NAME: cloud2020_4
 **/
@SpringBootApplication
//服务配置中心需要添加
@EnableConfigServer
public class ConfigCenterMain3344 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterMain3344.class, args);
    }
}

package xyz.wadewhy.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @PACKAGE_NAME: xyz.wadewhy.springcloud.config
 * @NAME: FeignConfig
 * @Author: 钟子豪
 * @DATE: 2020/5/15
 * @MONTH_NAME_FULL: 五月
 * @DAY: 15
 * @DAY_NAME_FULL: 星期五
 * @PROJECT_NAME: cloud2020_3
 **/
//日志
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}

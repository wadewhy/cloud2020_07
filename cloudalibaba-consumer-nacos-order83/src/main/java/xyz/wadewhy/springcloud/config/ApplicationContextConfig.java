package xyz.wadewhy.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @PACKAGE_NAME: xyz.wadewhy.springcloud.config
 * @NAME: ApplicationContextConfig
 * @Author: 钟子豪
 * @DATE: 2020/5/21
 * @MONTH_NAME_FULL: 五月
 * @DAY: 21
 * @DAY_NAME_FULL: 星期四
 * @PROJECT_NAME: cloud2020_6
 **/
@Configuration
public class ApplicationContextConfig
{
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }
}


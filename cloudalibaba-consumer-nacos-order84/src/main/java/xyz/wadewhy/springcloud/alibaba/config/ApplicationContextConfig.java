package xyz.wadewhy.springcloud.alibaba.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @PACKAGE_NAME: xyz.wadewhy.springcloud.alibaba.config
 * @NAME: ApplicationContextConfig
 * @Author: 钟子豪
 * @DATE: 2020/5/30
 * @MONTH_NAME_FULL: 五月
 * @DAY: 30
 * @DAY_NAME_FULL: 星期六
 * @PROJECT_NAME: cloud2020_7
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


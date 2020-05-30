package xyz.wadewhy.springcloud.alibaba.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PACKAGE_NAME: xyz.wadewhy.springcloud.alibaba.controller
 * @NAME: ConfigClientController
 * @Author: 钟子豪
 * @DATE: 2020/5/22
 * @MONTH_NAME_FULL: 五月
 * @DAY: 22
 * @DAY_NAME_FULL: 星期五
 * @PROJECT_NAME: cloud2020_6
 **/
@RestController
@RefreshScope //支持Nacos的动态刷新功能。
public class ConfigClientController
{
    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/config/info")
    public String getConfigInfo() {
        return configInfo;
//        return null;
    }
}


package xyz.wadewhy.springcloud.alibaba.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PACKAGE_NAME: xyz.wadewhy.springcloud.alibaba.controller
 * @NAME: ConfigClientController
 * @Author: 钟子豪
 * @DATE: 2020/5/18
 * @MONTH_NAME_FULL: 五月
 * @DAY: 18
 * @DAY_NAME_FULL: 星期一
 * @PROJECT_NAME: cloud2020_4
 **/
@RestController
@Slf4j
@RefreshScope
public class ConfigClientController {
    @Value("${config.info}")
    private String configInfo;
    @GetMapping("/configInfo")
    public String getConfigInfo(){
        return configInfo;
    }
}

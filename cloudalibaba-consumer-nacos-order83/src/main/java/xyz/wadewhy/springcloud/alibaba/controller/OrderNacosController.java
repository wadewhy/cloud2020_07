package xyz.wadewhy.springcloud.alibaba.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @PACKAGE_NAME: xyz.wadewhy.springcloud.alibaba.controller
 * @NAME: OrderNacosController
 * @Author: 钟子豪
 * @DATE: 2020/5/21
 * @MONTH_NAME_FULL: 五月
 * @DAY: 21
 * @DAY_NAME_FULL: 星期四
 * @PROJECT_NAME: cloud2020_6
 **/
@RestController
@Slf4j
public class OrderNacosController
{
    @Resource
    private RestTemplate restTemplate;
    @Value("${service-url.nacos-user-service}")
    private String serverURL;
    @GetMapping(value = "/consumer/payment/nacos/{id}")
    public String paymentInfo(@PathVariable("id") Long id)
    {
        return restTemplate.getForObject(serverURL+"/payment/nacos/"+id,String.class);
    }
}


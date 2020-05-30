package xyz.wadewhy.springcloud.alibaba.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PACKAGE_NAME: xyz.wadewhy.springcloud.alibaba.controller
 * @NAME: PaymentController
 * @Author: 钟子豪
 * @DATE: 2020/5/21
 * @MONTH_NAME_FULL: 五月
 * @DAY: 21
 * @DAY_NAME_FULL: 星期四
 * @PROJECT_NAME: cloud2020_6
 **/
@RestController
public class PaymentController
{
    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/nacos/{id}")
    public String getPayment(@PathVariable("id") Integer id)
    {
        return "nacos registry, serverPort: "+ serverPort+"\t id"+id;
    }
}

package xyz.wadewhy.springcloud.alibaba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import xyz.wadewhy.springcloud.entities.CommonResult;
import xyz.wadewhy.springcloud.entities.Payment;
import xyz.wadewhy.springcloud.service.PaymentFeignService;

import javax.annotation.Resource;

/**
 * @PACKAGE_NAME: xyz.wadewhy.springcloud.alibaba.controller
 * @NAME: OrderFeignController
 * @Author: 钟子豪
 * @DATE: 2020/5/14
 * @MONTH_NAME_FULL: 五月
 * @DAY: 14
 * @DAY_NAME_FULL: 星期四
 * @PROJECT_NAME: cloud2020_3
 **/
@RestController
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;
    //获取数据
    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }
    //模拟超时
    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout(){
        return paymentFeignService.paymentFeignTimeout();
    }
}


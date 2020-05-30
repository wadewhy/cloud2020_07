package xyz.wadewhy.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @PACKAGE_NAME: xyz.wadewhy.springcloud.service
 * @NAME: PaymentHystrixService
 * @Author: 钟子豪
 * @DATE: 2020/5/15
 * @MONTH_NAME_FULL: 五月
 * @DAY: 15
 * @DAY_NAME_FULL: 星期五
 * @PROJECT_NAME: cloud2020_3
 **/
@Component
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT",fallback = PaymentFallbackService.class)
public interface PaymentHystrixService {
    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id);

    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id);
}


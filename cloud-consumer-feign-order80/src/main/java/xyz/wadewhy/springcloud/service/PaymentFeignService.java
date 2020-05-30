package xyz.wadewhy.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import xyz.wadewhy.springcloud.entities.CommonResult;
import xyz.wadewhy.springcloud.entities.Payment;

@Component
//在注册中心找CLOUD-PAYMENT-SERVICE微服务
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
    /**
     * 该方法和微服务中Controller里的方法一致
     * @param id
     * @return
     */
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment>  getPaymentById(@PathVariable("id") Long id);

    /**
     * 模拟超时
     * @return
     */
    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();


}

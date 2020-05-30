package xyz.wadewhy.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @PACKAGE_NAME: xyz.wadewhy.springcloud.service
 * @NAME: PaymentFallbackService
 * @Author: 钟子豪
 * @DATE: 2020/5/16
 * @MONTH_NAME_FULL: 五月
 * @DAY: 16
 * @DAY_NAME_FULL: 星期六
 * @PROJECT_NAME: cloud2020_3
 **/
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }
}

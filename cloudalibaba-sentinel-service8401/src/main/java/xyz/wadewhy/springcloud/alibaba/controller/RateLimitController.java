package xyz.wadewhy.springcloud.alibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.wadewhy.springcloud.entities.CommonResult;
import xyz.wadewhy.springcloud.entities.Payment;
import xyz.wadewhy.springcloud.alibaba.myhandler.*;
/**
 * @PACKAGE_NAME: xyz.wadewhy.springcloud.alibaba.controller
 * @NAME: RateLimitController
 * @Author: 钟子豪
 * @DATE: 2020/5/30
 * @MONTH_NAME_FULL: 五月
 * @DAY: 30
 * @DAY_NAME_FULL: 星期六
 * @PROJECT_NAME: cloud2020_7
 **/
@RestController
public class RateLimitController {
    /**
     * 按资源名称限流+后续处理
     *  @SentinelResource
     * @return
     */
    @GetMapping("/byResource")
    @SentinelResource(value = "byResource",blockHandler = "handleException")
    public CommonResult byResource(){
        return new CommonResult(200,"按资源名称限流测试OK",new Payment(2020L,"serial001"));
    }
    public CommonResult handleException(BlockException exception)
    {
        return new CommonResult(444,exception.getClass().getCanonicalName()+"\t 服务不可用");
    }

    /**
     * 按照Url地址限流+后续处理
     * @return
     */
    @GetMapping("/rateLimit/byUrl")
    @SentinelResource(value = "byUrl")
    public CommonResult byUrl()
    {
        return new CommonResult(200,"按url限流测试OK",new Payment(2020L,"serial002"));
    }

    /**
     * 客户自定义限流处理逻辑
     * @return
     */
    @GetMapping("/rateLimit/customerBlockHandler")
    @SentinelResource(value = "customerBlockHandler",
            blockHandlerClass = CustomerBlockHandler.class,
            blockHandler = "handlerException2")
    public CommonResult customerBlockHandler()
    {
        return new CommonResult(200,"按客戶自定义",new Payment(2020L,"serial003"));
    }
}

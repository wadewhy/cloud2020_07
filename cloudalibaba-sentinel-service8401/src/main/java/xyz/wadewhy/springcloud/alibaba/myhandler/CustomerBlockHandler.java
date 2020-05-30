package xyz.wadewhy.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import xyz.wadewhy.springcloud.entities.CommonResult;

/**
 * @PACKAGE_NAME: xyz.wadewhy.springcloud.alibaba.myhandler
 * @NAME: CustomerBlockHandler
 * @Author: 钟子豪
 * @DATE: 2020/5/30
 * @MONTH_NAME_FULL: 五月
 * @DAY: 30
 * @DAY_NAME_FULL: 星期六
 * @PROJECT_NAME: cloud2020_7
 **/
public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException exception)
    {
        return new CommonResult(4444,"按客戶自定义,global handlerException----1");
    }
    public static CommonResult handlerException2(BlockException exception)
    {
        return new CommonResult(4444,"按客戶自定义,global handlerException----2");
    }
}

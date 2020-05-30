package xyz.wadewhy.springcloud.alibaba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.wadewhy.springcloud.service.IMessageProvider;

import javax.annotation.Resource;

/**
 * @PACKAGE_NAME: xyz.wadewhy.springcloud.alibaba.controller
 * @NAME: SendMessageController
 * @Author: 钟子豪
 * @DATE: 2020/5/20
 * @MONTH_NAME_FULL: 五月
 * @DAY: 20
 * @DAY_NAME_FULL: 星期三
 * @PROJECT_NAME: cloud2020_6
 **/
@RestController
public class SendMessageController
{
    @Resource
    private IMessageProvider messageProvider;

    @GetMapping(value = "/sendMessage")
    public String sendMessage()
    {
        return messageProvider.send();
    }

}


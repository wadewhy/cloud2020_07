package xyz.wadewhy.springcloud.service.impl;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import xyz.wadewhy.springcloud.service.IMessageProvider;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @PACKAGE_NAME: xyz.wadewhy.springcloud.service.impl
 * @NAME: MessageProviderImpl
 * @Author: 钟子豪
 * @DATE: 2020/5/20
 * @MONTH_NAME_FULL: 五月
 * @DAY: 20
 * @DAY_NAME_FULL: 星期三
 * @PROJECT_NAME: cloud2020_6
 **/
@EnableBinding(Source.class) //定义消息的推送管道
public class MessageProviderImpl implements IMessageProvider {
    @Resource
    private MessageChannel output;//消息发送管道
    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        //发送
        output.send(MessageBuilder.withPayload(serial).build());
        System.err.println("******send*****serial****: "+serial);
        return null;
    }
}

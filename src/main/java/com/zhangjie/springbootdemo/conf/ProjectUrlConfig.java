package com.zhangjie.springbootdemo.conf;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ClassName: Jason
 * @Author: Administrator
 * @Date: 2019/1/2 14:29
 * @Description:
 */
@Data
@Component
@ConfigurationProperties(prefix = "projectUrl")
public class ProjectUrlConfig {
    /**
     * 微信公众平台授权url
     */
    public String weChatMpAuthorize;

    /**
     * 微信开放平台授权url
     */
    public String weChatOpenAuthorize;


    /**
     * 获取公众号的AccessToken 的 URL
     */
    public String accessToken;

    /**
     * 获取jsApi-ticket
     */
    public String getticket;

}

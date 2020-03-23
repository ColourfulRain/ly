package com.ly;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author:lqq
 * @ClassName:LyGateway
 * @Time:2020/3/23
 * @Describe:
 */
@SpringCloudApplication
@EnableZuulProxy
public class LyGateway {

    public static void main(String[] args) {
        SpringApplication.run(LyGateway.class,args);
    }
}

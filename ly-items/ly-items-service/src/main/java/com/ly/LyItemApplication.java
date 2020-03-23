package com.ly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author:lqq
 * @ClassName:LyItemApplication
 * @Time:2020/3/23
 * @Describe:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class LyItemApplication {

    public static void main(String[] args) {
        SpringApplication.run(LyItemApplication.class,args);
    }
}

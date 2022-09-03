package com.tecsys.jvm.profiling.config;


import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableFeignClients(basePackages = "com.tecsys.jvm.profiling.proxy")
public class AppCfg {
}
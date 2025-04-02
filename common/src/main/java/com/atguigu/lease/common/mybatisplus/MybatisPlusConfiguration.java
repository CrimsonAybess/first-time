package com.atguigu.lease.common.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
/*
调用mapperscan路径类
 */
@MapperScan("com.atguigu.lease.web.*.mapper")
public class MybatisPlusConfiguration {

}
package com.zch.seckill.operation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhangchunhui
 * @date 2021/10/11
 */
@SpringBootApplication
@MapperScan("com.zch.seckill.operation.infrastructure.mapper")
public class SeckillOperationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeckillOperationApplication.class, args);
    }

}

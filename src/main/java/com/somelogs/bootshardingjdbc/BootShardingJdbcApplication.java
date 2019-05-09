package com.somelogs.bootshardingjdbc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.somelogs.bootshardingjdbc.mapper")
public class BootShardingJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootShardingJdbcApplication.class, args);
    }

}

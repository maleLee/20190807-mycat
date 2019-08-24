package com.aaa.lee.mycat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Company AAA软件教育
 * @Author Seven Lee
 * @Date Create in 2019/8/7 11:16
 * @Description
 **/
@SpringBootApplication
@MapperScan("com.aaa.lee.mycat.mapper")
public class ApplicationRun {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun.class, args);
    }

}


package com.github.scaffold;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.boot.dubbo.annotation.EnableDubboConfiguration;

/**
 * 启动入口
 * 
 * @author wangzhifeng
 * @EnableDubboConfiguration
 */
@SpringBootApplication
@MapperScan({ "com.github.scaffold.dal.dao" })
@EnableDubboConfiguration
public class ScaffoldAppMain {

    public static void main(String[] args) {
        SpringApplication.run(ScaffoldAppMain.class, args);
    }

}


package com.github.scaffold;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动入口
 * 
 * @author bill
 */
@SpringBootApplication
@MapperScan({ "com.github.scaffold.dal.dao" })
public class ScaffoldAppMain {

    public static void main(String[] args) {
        SpringApplication.run(ScaffoldAppMain.class, args);
    }

}

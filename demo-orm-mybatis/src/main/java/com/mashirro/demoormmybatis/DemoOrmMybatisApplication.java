package com.mashirro.demoormmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.mashirro.demoormmybatis.mapper"})
public class DemoOrmMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoOrmMybatisApplication.class, args);
	}

}

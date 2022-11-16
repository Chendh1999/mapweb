package com.cc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cc.dao")
public class MapwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(MapwebApplication.class, args);
	}

}

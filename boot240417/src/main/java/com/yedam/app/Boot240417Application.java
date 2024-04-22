package com.yedam.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.yedam.app.**.mapper")	//com.yedam.app.임의의이름.mapper 위치에 Mapper파일이 존재해야 한다는 의미
public class Boot240417Application {

	public static void main(String[] args) {
		SpringApplication.run(Boot240417Application.class, args);
	}

}

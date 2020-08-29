package com.bibleapp.bibleServices;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bibleapp.bibleServices.mappers")
public class BibleServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(BibleServicesApplication.class, args);
	}

}

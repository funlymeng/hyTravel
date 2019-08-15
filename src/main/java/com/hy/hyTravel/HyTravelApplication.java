package com.hy.hyTravel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@MapperScan("com.hy.hyTravel.mapper")
public class HyTravelApplication {

	public static void main(String[] args) {
		SpringApplication.run(HyTravelApplication.class, args);
	}

}

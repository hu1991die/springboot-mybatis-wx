package com.feizi.wx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
@MapperScan("com.feizi.wx.dao")
public class SpringbootMybatisWxApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatisWxApplication.class, args);
	}
}

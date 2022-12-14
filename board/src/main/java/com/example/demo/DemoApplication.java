package com.example.demo;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;


@SpringBootApplication
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class}) //whitelabel 오류처리

public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args); 
	}

	/*
	* SqlSessionFactory 설정 
	* Mybatis의 SqlSessionFactory 반환 
	* 스프링부트 실행 시 DataSource객체를 이 메서드 실행시 주입해서 결과를 만들고 그 결과를 스프링 내 빈으로 사용
	*/

	@Bean // 스프링에 필요한 객체 생성
	public SqlSessionFactory sqlessionFactory (DataSource datasource) throws Exception{
		
		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		
		sessionFactory.setDataSource(datasource);
		return sessionFactory.getObject();
				
	}

	
}


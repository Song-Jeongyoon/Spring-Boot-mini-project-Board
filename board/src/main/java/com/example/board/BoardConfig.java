package com.example.board;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;

public class BoardConfig {
	
	
	/*
	* SqlSessionFactory 설정 
	* Mybatis의 SqlSessionFactory 반환 
	* 스프링부트 실행 시 DataSource객체를 이 메서드 실행시 주입해서 결과를 만들고 그 결과를 스프링 내 빈으로 사용
	*/
	@Bean 
	public SqlSessionFactory sqlessionFactory (DataSource datasource) throws Exception{
		
		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(datasource);
		
		return sessionFactory.getObject();
				
	}

}

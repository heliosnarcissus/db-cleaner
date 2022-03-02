package com.cleaner.main.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
		private MyBatisUtil(){}
		
		//private final static Logger LOGGER = Logger.getLogger(MyBatisUtil.class);
		private static SqlSessionFactory sqlSessionFactory;
		static{
			try(Reader reader = Resources.getResourceAsReader("mybatis-config.xml")){
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			} catch (IOException e) {
			//	LOGGER.error(e.getMessage(), e);
				e.printStackTrace();
			}
		}
		
		public static SqlSessionFactory getSqlSessionFactory(){
			return sqlSessionFactory;
		}
}

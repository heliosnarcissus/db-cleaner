package com.cleaner.main.service;

import org.apache.ibatis.session.SqlSession;

import com.cleaner.main.mapper.LottoMoMapper;
import com.cleaner.main.util.MyBatisUtil;


public class LottoMoService {
	
	public int truncateEntries() {
		try(SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession()){
			LottoMoMapper lottomoMapper = session.getMapper(LottoMoMapper.class);
			lottomoMapper.truncateEntries();
			session.commit();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	public int truncateWinners() {
		try(SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession()){
			LottoMoMapper lottomoMapper = session.getMapper(LottoMoMapper.class);
			lottomoMapper.truncateWinners();
			session.commit();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	public int truncateReturnbets() {
		try(SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession()){
			LottoMoMapper lottomoMapper = session.getMapper(LottoMoMapper.class);
			lottomoMapper.truncateReturnbets();
			session.commit();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

}

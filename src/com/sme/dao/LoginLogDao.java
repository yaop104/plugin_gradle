package com.sme.dao;

import com.sme.entity.LoginLog;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Component("loginLogDao")
public interface LoginLogDao {
	
	void insert(LoginLog t) throws SQLException;
	
	List<LoginLog> page(Map<String, Object> map) throws SQLException;
	
	int count(Map<String, Object> map) throws SQLException;
	
	void batchDelete(List<Integer> list) throws SQLException;

}

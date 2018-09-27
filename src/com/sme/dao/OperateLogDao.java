package com.sme.dao;

import com.sme.entity.OperateLog;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Component("operateLogDao")
public interface OperateLogDao {
	
	void insert(OperateLog t) throws SQLException;
	
	List<OperateLog> page(Map<String, Object> map) throws SQLException;
	
	int count(Map<String, Object> map) throws SQLException;
	
	void batchDelete(List<Integer> list) throws SQLException;

}

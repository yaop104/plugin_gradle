package com.sme.dao;

import com.sme.core.dao.BaseDao;
import com.sme.entity.SysAcc;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
@Component("sysAccDao")
public interface SysAccDao extends BaseDao<SysAcc> {
	
	//================== begin ======================

	/**
	 * 删除用户 软删除
	 * @param id  用户id
	 * @throws SQLException SQL执行出错
	 */
	void deleteById(int id) throws SQLException;
	//================== end ======================
}

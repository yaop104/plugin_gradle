package com.sme.dao;

import com.sme.core.dao.BaseDao;
import com.sme.entity.SysRole;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
@Component("sysRoleDao")
public interface SysRoleDao extends BaseDao<SysRole>
{

	/**
	 * 删除 软删除
	 * @param id 角色id
	 * @throws SQLException 数据库异常
	 */
	void deleteById(int id) throws SQLException;
}

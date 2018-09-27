package com.sme.dao;

import com.sme.core.dao.BaseDao;
import com.sme.entity.SysMenu;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.List;
@Component("sysMenuDao")
public interface SysMenuDao extends BaseDao<SysMenu> {
	
	//================== begin ======================

	/**
	 * 删除 软删除
	 * @param sysMenuId 菜单主键
	 * @throws SQLException 数据库异常
	 */
	void deleteById(int sysMenuId) throws SQLException;
	
	List<SysMenu> selectMenus() throws SQLException;
	//================== end ======================
}

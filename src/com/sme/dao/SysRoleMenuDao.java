package com.sme.dao;

import com.sme.core.dao.BaseDao;
import com.sme.entity.SysRoleMenu;
import org.springframework.stereotype.Component;

import java.util.List;
@Component("sysRoleMenuDao")
public interface SysRoleMenuDao extends BaseDao<SysRoleMenu> {

	//================== begin ======================
		long isEixts(SysRoleMenu sysRoleMenu);
		
		void deleteByMenuAndRole(SysRoleMenu sysRoleMenu);

		List<String> selectMenuIds(SysRoleMenu sysRoleMenu);
		
	//================== end ======================

		
}

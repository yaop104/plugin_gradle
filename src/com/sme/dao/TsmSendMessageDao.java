package com.sme.dao;


import com.sme.core.dao.BaseDao;
import com.sme.entity.TsmSendMessage;
import org.springframework.stereotype.Component;
@Component("tsmSendMessageDao")
public interface TsmSendMessageDao extends BaseDao<TsmSendMessage> {

	
	//================== begin ======================
	TsmSendMessage selectLastCode(TsmSendMessage tsmSendMessage);

	//================== end ======================
}

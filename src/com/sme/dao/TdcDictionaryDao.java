package com.sme.dao;

import com.sme.core.dao.BaseDao;
import com.sme.entity.TdcDictionary;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("tdcDictionaryDao")
public interface TdcDictionaryDao extends BaseDao<TdcDictionary> {
    //================== begin ======================

    List<TdcDictionary> selectForDictionary(TdcDictionary tdcDictionary);

	//================== end ======================
}

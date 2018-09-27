package com.sme.dao;

import com.sme.core.dao.BaseDao;
import com.sme.entity.Feedback;
import org.springframework.stereotype.Component;

@Component("feedbackDao")
public interface FeedbackDao extends BaseDao<Feedback>{

}
package com.lyh.dao;

import com.lyh.model.Interview;

import java.util.List;

public interface InterviewMapper {
    List<Interview> interviews();//查询所有面试信息
    List<Interview> findInterviewsByGid(Interview interview);//根据游客id查询该游客的所有面试信息
    Interview findInterviewById(Interview interview);//根据面试表id查询面试信息
    boolean addInterview(Interview interview);//添加面试信息
    boolean updateInterview(Interview interview);//修改面试信息
    boolean deleteInterview(Interview interview);//删除面试信息
}

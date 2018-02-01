package com.lyh.service;

import com.lyh.model.Interview;

import java.util.List;

public interface InterviewService {
    List<Interview> interviews();
    List<Interview> findInterviewsByGid(Interview interview);//根据游客id查询该游客的所有面试信息
    Interview findInterviewById(Interview interview);//根据面试表id查询面试信息
    boolean addInterview(Interview interview);
    boolean updateInterview(Interview interview);
    boolean deleteInterview(Interview interview);
}

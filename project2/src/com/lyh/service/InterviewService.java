package com.lyh.service;

import com.lyh.model.Interview;

import java.util.List;

public interface InterviewService {
    List<Interview> interviews();
    List<Interview> findInterviewsByGid(Interview interview);//�����ο�id��ѯ���ο͵�����������Ϣ
    Interview findInterviewById(Interview interview);//�������Ա�id��ѯ������Ϣ
    boolean addInterview(Interview interview);
    boolean updateInterview(Interview interview);
    boolean deleteInterview(Interview interview);
}

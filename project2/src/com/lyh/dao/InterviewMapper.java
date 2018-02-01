package com.lyh.dao;

import com.lyh.model.Interview;

import java.util.List;

public interface InterviewMapper {
    List<Interview> interviews();//��ѯ����������Ϣ
    List<Interview> findInterviewsByGid(Interview interview);//�����ο�id��ѯ���ο͵�����������Ϣ
    Interview findInterviewById(Interview interview);//�������Ա�id��ѯ������Ϣ
    boolean addInterview(Interview interview);//���������Ϣ
    boolean updateInterview(Interview interview);//�޸�������Ϣ
    boolean deleteInterview(Interview interview);//ɾ��������Ϣ
}

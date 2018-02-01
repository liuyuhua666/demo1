package com.lyh.dao;

import com.lyh.model.Recruitment;

import java.util.List;

public interface RecruitmentMapper {
    List<Recruitment> recruitments();//��ѯ������Ƹ��Ϣ
    Recruitment findRecruitmentById(Recruitment recruitment);//������Ƹ��Ϣ��id����ѯ
    boolean addRecruitment(Recruitment recruitment);//�����Ƹ��Ϣ
    boolean updateRecruitment(Recruitment recruitment);//�޸���Ƹ��Ϣ
    boolean deleteRecruitment(Recruitment recruitment);//ɾ����Ƹ��Ϣ
}

package com.lyh.service;

import com.lyh.model.PersonalRecruitment;

public interface PersonalRecruitmentService {
    PersonalRecruitment findPersonalRecruitmentByGid(PersonalRecruitment personalRecruitment);//ͨ��gid��ѯ������Ƹ��Ϣ
    boolean addPersonalRecruitment(PersonalRecruitment personalRecruitment);//��Ӹ�����Ƹ��Ϣ
}

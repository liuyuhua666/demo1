package com.lyh.dao;

import com.lyh.model.PersonalRecruitment;

public interface PersonalRecruitmentMapper {
    PersonalRecruitment findPersonalRecruitmentByGid(PersonalRecruitment personalRecruitment);//ͨ��gid��ѯ������Ƹ��Ϣ
    boolean addPersonalRecruitment(PersonalRecruitment personalRecruitment);//��Ӹ�����Ƹ��Ϣ
}

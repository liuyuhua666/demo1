package com.lyh.dao;

import com.lyh.model.PersonalRecruitment;

public interface PersonalRecruitmentMapper {
    PersonalRecruitment findPersonalRecruitmentByGid(PersonalRecruitment personalRecruitment);//通过gid查询个人招聘信息
    boolean addPersonalRecruitment(PersonalRecruitment personalRecruitment);//添加个人招聘信息
}

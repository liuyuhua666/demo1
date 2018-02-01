package com.lyh.service.impl;

import com.lyh.dao.PersonalRecruitmentMapper;
import com.lyh.model.PersonalRecruitment;
import com.lyh.service.PersonalRecruitmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("personalRecruitmentService")
public class PersonalRecruitmentServiceImpl implements PersonalRecruitmentService{
    @Resource
    private PersonalRecruitmentMapper personalRecruitmentMapper;
    @Override
    public PersonalRecruitment findPersonalRecruitmentByGid(PersonalRecruitment personalRecruitment) {
        return personalRecruitmentMapper.findPersonalRecruitmentByGid(personalRecruitment);
    }

    @Override
    public boolean addPersonalRecruitment(PersonalRecruitment personalRecruitment) {
        return personalRecruitmentMapper.addPersonalRecruitment(personalRecruitment);
    }
}

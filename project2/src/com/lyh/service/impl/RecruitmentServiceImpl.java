package com.lyh.service.impl;

import com.lyh.dao.RecruitmentMapper;
import com.lyh.model.Recruitment;
import com.lyh.service.RecruitmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("/recruitmentService")
public class RecruitmentServiceImpl implements RecruitmentService{
    @Resource
    private RecruitmentMapper recruitmentMapper;
    @Override
    public List<Recruitment> recruitments() {
        return recruitmentMapper.recruitments();
    }

    @Override
    public Recruitment findRecruitmentById(Recruitment recruitment) {
        return recruitmentMapper.findRecruitmentById(recruitment);
    }

    @Override
    public boolean addRecruitment(Recruitment recruitment) {
        return recruitmentMapper.addRecruitment(recruitment);
    }

    @Override
    public boolean updateRecruitment(Recruitment recruitment) {
        return recruitmentMapper.updateRecruitment(recruitment);
    }

    @Override
    public boolean deleteRecruitment(Recruitment recruitment) {
        return recruitmentMapper.deleteRecruitment(recruitment);
    }
}

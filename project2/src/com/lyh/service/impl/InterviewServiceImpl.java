package com.lyh.service.impl;

import com.lyh.dao.InterviewMapper;
import com.lyh.model.Interview;
import com.lyh.service.InterviewService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("interviewService")
public class InterviewServiceImpl implements InterviewService{
    @Resource
    private InterviewMapper interviewMapper;
    @Override
    public List<Interview> interviews() {
        return interviewMapper.interviews();
    }

    @Override
    public List<Interview> findInterviewsByGid(Interview interview) {
        return interviewMapper.findInterviewsByGid(interview);
    }

    @Override
    public Interview findInterviewById(Interview interview) {
        return interviewMapper.findInterviewById(interview);
    }

    @Override
    public boolean addInterview(Interview interview) {
        return interviewMapper.addInterview(interview);
    }

    @Override
    public boolean updateInterview(Interview interview) {
        return interviewMapper.updateInterview(interview);
    }

    @Override
    public boolean deleteInterview(Interview interview) {
        return interviewMapper.deleteInterview(interview);
    }
}

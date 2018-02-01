package com.lyh.service.impl;

import com.lyh.dao.ResumeMapper;
import com.lyh.model.Guest;
import com.lyh.model.Resume;
import com.lyh.service.ResumeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("resumeService")
public class ResumeServiceImpl implements ResumeService{
    @Resource
    private ResumeMapper resumeMapper;
    @Override
    public Resume findResumeByGid(Resume resume) {
        return resumeMapper.findResumeByGid(resume);
    }

    @Override
    public Resume findResumeById(Resume resume) {
        return resumeMapper.findResumeById(resume);
    }

    @Override
    public boolean addResume(Resume resume) {
        return resumeMapper.addResume(resume);
    }

    @Override
    public boolean updateResumeById(Resume resume) {
        return resumeMapper.updateResumeById(resume);
    }

    @Override
    public boolean deleteResumeById(Resume resume) {
        return resumeMapper.deleteResumeById(resume);
    }

    @Override
    public List<Resume> resumes() {
        return resumeMapper.resumes();
    }

}

package com.lyh.service;

import com.lyh.model.Guest;
import com.lyh.model.Resume;

import java.util.List;

public interface ResumeService {
    Resume findResumeByGid(Resume resume);
    Resume findResumeById(Resume resume);//根据id查询简历
    boolean addResume(Resume resume);
    boolean updateResumeById(Resume resume);
    boolean deleteResumeById(Resume resume);
    List<Resume> resumes();//查询所有简历
}

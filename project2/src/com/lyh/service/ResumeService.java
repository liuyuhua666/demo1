package com.lyh.service;

import com.lyh.model.Guest;
import com.lyh.model.Resume;

import java.util.List;

public interface ResumeService {
    Resume findResumeByGid(Resume resume);
    Resume findResumeById(Resume resume);//����id��ѯ����
    boolean addResume(Resume resume);
    boolean updateResumeById(Resume resume);
    boolean deleteResumeById(Resume resume);
    List<Resume> resumes();//��ѯ���м���
}

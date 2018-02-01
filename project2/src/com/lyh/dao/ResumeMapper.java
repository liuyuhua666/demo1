package com.lyh.dao;

import com.lyh.model.Guest;
import com.lyh.model.Resume;

import java.util.List;

public interface ResumeMapper {
    Resume findResumeByGid(Resume resume);//�����ο�id��ѯ����
    Resume findResumeById(Resume resume);//����id��ѯ����
    boolean addResume(Resume resume);//��Ӽ���
    boolean updateResumeById(Resume resume);//�޸ļ���
    boolean deleteResumeById(Resume resume);//ɾ������
    List<Resume> resumes();//��ѯ���м���
}

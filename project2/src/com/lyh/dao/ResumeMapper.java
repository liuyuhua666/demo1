package com.lyh.dao;

import com.lyh.model.Guest;
import com.lyh.model.Resume;

import java.util.List;

public interface ResumeMapper {
    Resume findResumeByGid(Resume resume);//根据游客id查询简历
    Resume findResumeById(Resume resume);//根据id查询简历
    boolean addResume(Resume resume);//添加简历
    boolean updateResumeById(Resume resume);//修改简历
    boolean deleteResumeById(Resume resume);//删除简历
    List<Resume> resumes();//查询所有简历
}

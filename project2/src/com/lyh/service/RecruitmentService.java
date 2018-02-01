package com.lyh.service;

import com.lyh.model.Recruitment;

import java.util.List;

public interface RecruitmentService {
    List<Recruitment> recruitments();//查询所有招聘信息
    Recruitment findRecruitmentById(Recruitment recruitment);//根据招聘信息的id来查询
    boolean addRecruitment(Recruitment recruitment);//添加招聘信息
    boolean updateRecruitment(Recruitment recruitment);//修改招聘信息
    boolean deleteRecruitment(Recruitment recruitment);//删除招聘信息
}

package com.lyh.controller;

import com.lyh.model.Recruitment;
import com.lyh.service.RecruitmentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class managerController {
    @Resource
    private RecruitmentService recruitmentService;

    @RequestMapping("/managerRegister")
    public String managerRegister(HttpSession session)throws Exception{
        List<Recruitment> recruitmentList=recruitmentService.recruitments();
        session.setAttribute("recruitmentList",recruitmentList);
        return "manager";
    }
}

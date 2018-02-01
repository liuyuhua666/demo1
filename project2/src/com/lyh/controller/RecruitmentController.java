package com.lyh.controller;

import com.lyh.model.Guest;
import com.lyh.model.Recruitment;
import com.lyh.service.RecruitmentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class RecruitmentController {
    @Resource
    private RecruitmentService recruitmentService;

    @RequestMapping("/toAddRecruitment")
    public String toAddRecruitment()throws Exception{
        return "addRecruitment";
    }

    @RequestMapping("/addRecruitment")
    public String addRecruitment(Recruitment recruitment, HttpSession session)throws Exception{
        if(recruitmentService.addRecruitment(recruitment)){
            List<Recruitment> recruitmentList=recruitmentService.recruitments();
            session.setAttribute("recruitmentList",recruitmentList);
            return "manager";
        }
        return "addRecruitment";
    }

    @RequestMapping("/toUpdateRecruitment")
    public String toUpdateRecruitment(Recruitment recruitment,HttpSession session)throws Exception{
        Recruitment recruitment1=recruitmentService.findRecruitmentById(recruitment);
        session.setAttribute("recruitment",recruitment1);
        return "updateRecruitment";
    }

    @RequestMapping("/updateRecruitment")
    public String updateRecruitment(Recruitment recruitment,HttpSession session)throws Exception{
        if(recruitmentService.updateRecruitment(recruitment)){
            List<Recruitment> recruitmentList=recruitmentService.recruitments();
            session.setAttribute("recruitmentList",recruitmentList);
            return "manager";
        }
        return "updateRecruitment";
    }

    @RequestMapping("/toDeleteRecruitment")
    public String deleteRecruitment(Recruitment recruitment,HttpSession session)throws Exception{
        recruitmentService.deleteRecruitment(recruitment);
        List<Recruitment> recruitmentList=recruitmentService.recruitments();
        session.setAttribute("recruitmentList",recruitmentList);
        return "manager";
    }

    @RequestMapping("/toRecruitment")
    public String toRecruitment(Recruitment recruitment,HttpSession session)throws Exception{
        Recruitment recruitment1=recruitmentService.findRecruitmentById(recruitment);
        session.setAttribute("recruitment",recruitment1);
        return "recruitment";
    }
}

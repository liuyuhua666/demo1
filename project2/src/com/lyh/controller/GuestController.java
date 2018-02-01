package com.lyh.controller;

import com.lyh.model.Guest;
import com.lyh.model.Recruitment;
import com.lyh.service.GuestService;
import com.lyh.service.RecruitmentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class GuestController {
    @Resource
    private GuestService guestService;

    @Resource
    private RecruitmentService recruitmentService;

    @RequestMapping("/toLogin")
    public String toLogin(Guest guest, HttpSession session) throws Exception{
        List<Guest> guestList=guestService.findGuests();
        if(guestList.size()>0){
            for(Guest guest1:guestList){
                if(guest.getG_name().equals(guest1.getG_name())&&guest.getG_password().equals(guest1.getG_password())){
                    List<Recruitment> recruitmentList=recruitmentService.recruitments();
                    session.setAttribute("recruitmentList",recruitmentList);
                    session.setAttribute("guest",guest1);
                    return "main";
                }
            }
        }
        return "../../index";
    }

    @RequestMapping("/toRegister")
    public String toRegister()throws Exception{
        return "register";
    }

    @RequestMapping("/register")
    public String register(Guest guest) throws Exception{
        guest.setG_applicationstatus(0);
        if(guestService.addGuest(guest)){
            return "../../index";
        }
        return "register";
    }

    @RequestMapping("/toMain")
    public String toMain()throws Exception{
        return "main";
    }
}

package com.lyh.controller;

import com.lyh.model.Guest;
import com.lyh.model.Resume;
import com.lyh.service.GuestService;
import com.lyh.service.ResumeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class ResumeController {
    @Resource
    private ResumeService resumeService;
    @Resource
    private GuestService guestService;

    @RequestMapping("/toMyResume")
    public String toMyResume(Resume resume,HttpSession session)throws Exception{
        Guest guest= (Guest) session.getAttribute("guest");
        resume.setR_gid(guest.getG_id());
        Resume resume1=resumeService.findResumeByGid(resume);
        session.setAttribute("resume",resume1);
        return "myResume";
    }
    @RequestMapping("/myResumes")
    public String myResume(Resume resume,HttpSession session)throws Exception{
        Guest guest= (Guest) session.getAttribute("guest");
        if(guest.getG_applicationstatus()==0){
            resume.setR_gid(guest.getG_id());
            if(resumeService.addResume(resume)){
                guest.setG_applicationstatus(1);
                if(guestService.updateGuestById(guest)){
                    session.setAttribute("resume",resume);
                    return "myResume";
                }
            }
        }
        return "addResume";
    }
    @RequestMapping("/toAddResume")
    public String toAddResume(HttpSession session){
        Guest guest= (Guest) session.getAttribute("guest");
        if(guest.getG_applicationstatus()==1){
            return "myResume";
        }
        return "addResume";
    }

    @RequestMapping("/toUpdateResume")
    public String toUpdateResume(){
        return "updateResume";
    }

    @RequestMapping("/updateResume")
    public String updateResume(Resume resume,HttpSession session){
        Resume resume1= (Resume) session.getAttribute("resume");
        resume.setR_id(resume1.getR_id());
       if(resumeService.updateResumeById(resume)){
           Guest guest= (Guest) session.getAttribute("guest");
           resume.setR_gid(guest.getG_id());
           Resume resume2=resumeService.findResumeByGid(resume);
           session.setAttribute("resume",resume2);
           return "myResume";
       }
       return "updateResume";
    }
    @RequestMapping("/todeleteResume")
    public String todeleteResume(Resume resume,HttpSession session){
        resumeService.deleteResumeById(resume);
        Resume resume1=resumeService.findResumeByGid(resume);
        session.setAttribute("resume",resume1);
        Guest guest= (Guest) session.getAttribute("guest");
        guest.setG_applicationstatus(0);
        guestService.updateGuestById(guest);
        return "myResume";
    }

    @RequestMapping("/personalResume")
    public String personalResume(Resume resume,HttpSession session){
        Resume resume1=resumeService.findResumeById(resume);
        session.setAttribute("resume",resume1);
        return "personalResume";
    }
}

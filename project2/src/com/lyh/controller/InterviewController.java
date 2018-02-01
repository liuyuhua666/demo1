package com.lyh.controller;

import com.lyh.model.*;
import com.lyh.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class InterviewController {
    @Resource
    private InterviewService interviewService;
    @Resource
    private RecruitmentService recruitmentService;
    @Resource
    private ResumeService resumeService;
    @Resource
    private PersonalRecruitmentService personalRecruitmentService;
    @Resource
    private GuestService guestService;
    @Resource
    private EmployeeService employeeService;

    @RequestMapping("/acceptRecruitment")
    public String acceptRecruitment(Interview interview, Recruitment recruitment, PersonalRecruitment personalRecruitment, HttpSession session)throws Exception{
        Guest guest= (Guest) session.getAttribute("guest");
        interview.setI_gid(guest.getG_id());
        interview.setI_gstatus(0);
        recruitment.setRm_id(interview.getI_rmid());
        Recruitment recruitment1=recruitmentService.findRecruitmentById(recruitment);
        personalRecruitment.setPrm_cname(recruitment1.getRm_cname());
        personalRecruitment.setPrm_dname(recruitment1.getRm_dname());
        personalRecruitment.setPrm_jname(recruitment1.getRm_jname());
        personalRecruitment.setPrm_money(recruitment1.getRm_money());
        personalRecruitment.setPrm_workplace(recruitment1.getRm_workplace());
        personalRecruitment.setPrm_gid(guest.getG_id());
        personalRecruitmentService.addPersonalRecruitment(personalRecruitment);
        interview.setI_cname(recruitment1.getRm_cname());
        interview.setI_jname(recruitment1.getRm_jname());
        if(interviewService.addInterview(interview)){
            return "main";
        }
        return "recruitment";
    }
    @RequestMapping("/allInterviews")
    public String allInterviews(HttpSession session)throws Exception{
        List<Interview> interviewList=interviewService.interviews();
        List<Resume> resumeList=resumeService.resumes();
        session.setAttribute("interviewList",interviewList);
        session.setAttribute("resumeList",resumeList);
        return "allInterviews";
    }

    @RequestMapping("/requestInterview")
    public String requestInterview(Interview interview,HttpSession session)throws Exception{
        List<Interview> interviewList=interviewService.findInterviewsByGid(interview);
        Interview interview1=interviewList.get(0);
        session.setAttribute("interview",interview1);
        return "requestInterview";
    }

    @RequestMapping("/toRequestInterview")
    public String toRequestInterview(Interview interview)throws Exception{
        Interview interview1=interviewService.findInterviewById(interview);
        interview.setI_gid(interview1.getI_gid());
        interview.setI_rmid(interview1.getI_rmid());
        interview.setI_jname(interview.getI_jname());
        if(interviewService.updateInterview(interview)){
            return "allInterviews";
        }
        return "requestInterview";
    }

    @RequestMapping("/inviteInterview")
    public String inviteInterview(Interview interview,HttpSession session)throws Exception{
        Guest guest= (Guest) session.getAttribute("guest");
        interview.setI_gid(guest.getG_id());
        List<Interview> interviewList=interviewService.findInterviewsByGid(interview);
        session.setAttribute("interviewList",interviewList);
        return "myInterviews";
    }

    @RequestMapping("/toInviteInterview")
    public String toInviteInterview(Interview interview,HttpSession session)throws Exception{
        Interview interview1=interviewService.findInterviewById(interview);
        session.setAttribute("interview",interview1);
        return "myInterview";
    }

    @RequestMapping("/giveUpInterview")
    public String giveUpInterview(Interview interview)throws Exception{
        Interview interview1=interviewService.findInterviewById(interview);
        interview1.setI_gstatus(1);
        if(interviewService.updateInterview(interview1)){
            return "main";
        }
        return "myInterview";
    }

    @RequestMapping("/confirmeInterview")
    public String confirmeInterview(Interview interview)throws Exception{
        Interview interview1=interviewService.findInterviewById(interview);
        interview1.setI_gstatus(2);
        if(interviewService.updateInterview(interview1)){
            return "main";
        }
        return "myInterview";
    }

    @RequestMapping("/resultInterviews")
    public String resultInterviews(HttpSession session)throws Exception{
        List<Interview> interviewList=interviewService.interviews();
        List<Guest> guestList=guestService.findGuests();
        session.setAttribute("interviewList",interviewList);
        session.setAttribute("guestList",guestList);
        return "resultInterviews";
    }

    @RequestMapping("/resultInterview")
    public String resultInterview(Interview interview,Guest guest,HttpSession session)throws Exception{
        Interview interview1=interviewService.findInterviewById(interview);
        guest.setG_id(interview.getI_gid());
        Guest guest1=guestService.findGuestById(guest);
        session.setAttribute("interview",interview1);
        session.setAttribute("guest",guest1);
        return "resultInterview";
    }

    @RequestMapping("/updateResult")
    public String updateResult(Interview interview,Resume resume,Recruitment recruitment,Employee employee,Guest guest,HttpSession session)throws Exception{
        Interview interview1=interviewService.findInterviewById(interview);
        interview1.setI_result(interview.getI_result());
        if(interviewService.updateInterview(interview1)){
            guest.setG_id(interview1.getI_gid());
            Guest guest1= guestService.findGuestById(guest);
            resume.setR_gid(interview1.getI_gid());
            Resume resume1=resumeService.findResumeByGid(resume);
            recruitment.setRm_id(interview.getI_rmid());
            Recruitment recruitment1=recruitmentService.findRecruitmentById(recruitment);
            employee.setE_name(guest1.getG_name());
            employee.setE_password(guest1.getG_password());
            employee.setE_realname(resume1.getR_name());
            employee.setE_age(resume1.getR_age());
            employee.setE_ethnicity(resume1.getR_ethnicity());
            employee.setE_phone(resume1.getR_phone());
            employee.setE_marrige(resume1.getR_marrige());
            employee.setE_address(resume1.getR_address());
            employee.setE_cname(recruitment1.getRm_cname());
            employee.setE_dname(recruitment1.getRm_dname());
            employee.setE_jname(recruitment1.getRm_jname());
            employee.setE_basicwage(recruitment1.getRm_money());
            if(employeeService.addEmployee(employee)){
                return "manager";
            }
        }
        return "resultInterview";
    }
}

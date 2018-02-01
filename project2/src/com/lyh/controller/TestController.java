package com.lyh.controller;

import com.lyh.model.Guest;
import com.lyh.service.GuestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class TestController {
    @Resource
    private GuestService guestService;
    @RequestMapping("test1")
    public void test1(Guest guest, HttpServletResponse response) throws IOException {
        List<Guest> guestList=guestService.findGuests();
        if(guestList.size()>0){
            for(Guest guest1:guestList){
                if(guest1.getG_name().equals(guest.getG_name())){
                    response.getWriter().print("该用户名已存在");
                }
            }
        }
    }
}

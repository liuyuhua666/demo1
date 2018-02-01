package com.lyh.dao;

import com.lyh.model.Guest;

import java.util.List;

public interface GuestMapper {
    List<Guest> findGuests();//查询所有的用户
    Guest findGuestById(Guest guest);//查询用户的个人信息
    boolean addGuest(Guest guest);//注册
    boolean updateGuestById(Guest guest);//修改个人信息
    boolean deleteGuestById(Guest guest);//注销账号
}

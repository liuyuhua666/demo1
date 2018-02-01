package com.lyh.dao;

import com.lyh.model.Guest;

import java.util.List;

public interface GuestMapper {
    List<Guest> findGuests();//��ѯ���е��û�
    Guest findGuestById(Guest guest);//��ѯ�û��ĸ�����Ϣ
    boolean addGuest(Guest guest);//ע��
    boolean updateGuestById(Guest guest);//�޸ĸ�����Ϣ
    boolean deleteGuestById(Guest guest);//ע���˺�
}

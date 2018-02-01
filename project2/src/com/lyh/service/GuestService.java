package com.lyh.service;

import com.lyh.model.Guest;

import java.util.List;

public interface GuestService {
    List<Guest> findGuests();//��ѯ���е��û�
    Guest findGuestById(Guest guest);//��ѯ�û��ĸ�����Ϣ
    boolean addGuest(Guest guest);//ע��
    boolean updateGuestById(Guest guest);//�޸ĸ�����Ϣ
    boolean deleteGuestById(Guest guest);//ע���˺�
}

package com.lyh.service.impl;

import com.lyh.dao.GuestMapper;
import com.lyh.model.Guest;
import com.lyh.service.GuestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("guestService")
public class GuestServiceImpl implements GuestService{
    @Resource
    private GuestMapper guestMapper;
    @Override
    public List<Guest> findGuests() {
        return guestMapper.findGuests();
    }

    @Override
    public Guest findGuestById(Guest guest) {
        return guestMapper.findGuestById(guest);
    }

    @Override
    public boolean addGuest(Guest guest) {
        return guestMapper.addGuest(guest);
    }

    @Override
    public boolean updateGuestById(Guest guest) {
        return guestMapper.updateGuestById(guest);
    }

    @Override
    public boolean deleteGuestById(Guest guest) {
        return guestMapper.deleteGuestById(guest);
    }
}

package com.nsimat.lil.sbet.landon.roomwebapp.services;

import com.nsimat.lil.sbet.landon.roomwebapp.data.StaffRepository;
import com.nsimat.lil.sbet.landon.roomwebapp.models.Position;
import com.nsimat.lil.sbet.landon.roomwebapp.models.StaffMember;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class StaffService {
    private final StaffRepository staffRepository;

    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public List<StaffMember> getAllStaff(){
        return staffRepository.findAll();
    }
}

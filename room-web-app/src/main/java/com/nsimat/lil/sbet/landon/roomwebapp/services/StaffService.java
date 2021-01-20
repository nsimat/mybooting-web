package com.nsimat.lil.sbet.landon.roomwebapp.services;

import com.nsimat.lil.sbet.landon.roomwebapp.models.Position;
import com.nsimat.lil.sbet.landon.roomwebapp.models.StaffMember;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class StaffService {
    private static final List<StaffMember> staff = new ArrayList<>();

    static{
        staff.add(new StaffMember(UUID.randomUUID().toString(), "John", "Guruma", Position.CONCIERGE));
        staff.add(new StaffMember(UUID.randomUUID().toString(), "Brian", "Kapesa", Position.FRONT_DESK));
        staff.add(new StaffMember(UUID.randomUUID().toString(), "Mike", "Matondo", Position.SECURITY));
        staff.add(new StaffMember(UUID.randomUUID().toString(), "Clarisse", "Ouedraogo", Position.HOUSEKEEPING));
    }

    public List<StaffMember> getAllStaff(){
        return staff;
    }
}

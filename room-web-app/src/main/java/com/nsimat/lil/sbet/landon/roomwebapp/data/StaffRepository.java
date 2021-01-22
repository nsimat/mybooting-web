package com.nsimat.lil.sbet.landon.roomwebapp.data;

import com.nsimat.lil.sbet.landon.roomwebapp.models.StaffMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<StaffMember, String> {
}

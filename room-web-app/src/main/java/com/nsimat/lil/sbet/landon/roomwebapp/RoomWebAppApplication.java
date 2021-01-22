package com.nsimat.lil.sbet.landon.roomwebapp;

import com.nsimat.lil.sbet.landon.roomwebapp.data.RoomRepository;
import com.nsimat.lil.sbet.landon.roomwebapp.data.StaffRepository;
import com.nsimat.lil.sbet.landon.roomwebapp.models.Position;
import com.nsimat.lil.sbet.landon.roomwebapp.models.Room;
import com.nsimat.lil.sbet.landon.roomwebapp.models.StaffMember;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RoomWebAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(RoomWebAppApplication.class, args);
    }

    @Bean
    public CommandLineRunner dataLoader(RoomRepository roomRepository, StaffRepository staffRepository){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                roomRepository.save (new Room("Piccadilly", "P1", "1Q"));
                roomRepository.save (new Room("Piccadilly", "P2", "1Q"));
                roomRepository.save (new Room("Piccadilly", "P3", "1Q"));
                roomRepository.save (new Room("Piccadilly", "P4", "2D"));
                roomRepository.save (new Room("Piccadilly", "P5", "2D"));
                roomRepository.save (new Room("Piccadilly", "P6", "2D"));
                roomRepository.save (new Room("Cambridge", "C1", "1K"));
                roomRepository.save (new Room("Cambridge", "C2", "1K"));
                roomRepository.save (new Room("Cambridge", "C3", "1K"));
                roomRepository.save (new Room("Westminster", "W1", "1K"));
                roomRepository.save (new Room("Westminster", "W2", "1K"));
                roomRepository.save (new Room("Westminster", "W3", "1K"));
                roomRepository.save (new Room("Westminster", "W4", "1K"));
                roomRepository.save (new Room("Westminster", "W5", "2D"));
                roomRepository.save (new Room("Westminster", "W6", "2D"));
                roomRepository.save (new Room("Westminster", "W7", "2D"));
                roomRepository.save (new Room("Oxford", "O1", "1K"));
                roomRepository.save (new Room("Oxford", "O2", "1K"));
                roomRepository.save (new Room("Oxford", "O3", "1Q"));
                roomRepository.save (new Room("Oxford", "O4", "1Q"));
                roomRepository.save (new Room("Oxford", "O5", "1Q"));
                roomRepository.save (new Room("Victoria", "V1", "1K"));
                roomRepository.save (new Room("Victoria", "V2", "2D"));
                roomRepository.save (new Room("Victoria", "V3", "2D"));
                roomRepository.save (new Room("Manchester", "M1", "1K"));
                roomRepository.save (new Room("Manchester", "M2", "1K"));
                roomRepository.save (new Room("Manchester", "M3", "1K"));
                roomRepository.save (new Room("Manchester", "M4", "1K"));

                staffRepository.save (new StaffMember("9f717667-505a-4074-ba43-ceae2c0e9f4b", "Adams", "Roy", Position.HOUSEKEEPING) );
                staffRepository.save (new StaffMember("3cb69467-dcaa-4d53-84d9-c0d7ba439645", "Adams", "Martin", Position.SECURITY));
                staffRepository.save (new StaffMember("a36df0b3-da59-47e3-b110-37a5a222d46b", "Alvarez", "Roger", Position.FRONT_DESK));
                staffRepository.save (new StaffMember("0e235279-ba2d-40f8-8cfa-c346be49eb47", "Alvarez", "Anne", Position.HOUSEKEEPING));
                staffRepository.save (new StaffMember("461f5182-9ab1-4e27-a1fb-0c2669bfbb55", "Alvarez", "Ann", Position.CONCIERGE));
                staffRepository.save (new StaffMember("eeefd5a8-d4b8-49b0-af0d-a7e9eb170db6", "Anderson", "Betty", Position.HOUSEKEEPING));
                staffRepository.save (new StaffMember("5ee0a977-6856-455e-becb-0a4de6d08958", "Anderson", "Laura", Position.HOUSEKEEPING));
                staffRepository.save (new StaffMember("784234d6-5b90-4471-a51e-eb00940a5608", "Armstrong", "Christopher", Position.HOUSEKEEPING));
                staffRepository.save (new StaffMember("241c9d7b-f6e9-46e7-807a-e82f33d7ab35", "Bell", "David", Position.HOUSEKEEPING));
                staffRepository.save (new StaffMember("f01ec3b4-7e44-49d1-8601-929d88524286", "Berry", "Paula", Position.SECURITY));
                staffRepository.save (new StaffMember("cb2f2846-d432-4f81-b6cb-06c03c9aaf03", "Bishop", "Dennis", Position.HOUSEKEEPING));
                staffRepository.save (new StaffMember("fff66b51-fd6b-40ac-9422-79079595a05f", "Bishop", "Carolyn", Position.CONCIERGE));
                staffRepository.save (new StaffMember("bb5f87cd-58e5-4f7b-9f82-e9984cbc4e85", "Black", "Harold", Position.FRONT_DESK));
                staffRepository.save (new StaffMember("c063038f-5854-4b45-8e76-322ddc7794aa", "Bowman", "Jerry", Position.HOUSEKEEPING));
                staffRepository.save (new StaffMember("d5371ef2-6fe5-45bf-a1f3-07d79d408d03", "Bradley", "Keith", Position.FRONT_DESK));
                staffRepository.save (new StaffMember("2d43db23-1994-40a3-9b82-17cd57bfa8d6", "Brooks", "Samuel", Position.HOUSEKEEPING));
                staffRepository.save (new StaffMember("c0dd0ccc-5f69-477a-87ea-19b7d7ecbe6c", "Bryant", "Donald", Position.FRONT_DESK));
                staffRepository.save (new StaffMember("de8e222e-dcb1-42e3-bcaf-b0aff93527c3", "Burke", "Tammy", Position.SECURITY));
            }
        };
    }

}

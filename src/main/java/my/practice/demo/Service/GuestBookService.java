package my.practice.demo.Service;

// This class will Manage all services for Guest Book



import lombok.extern.slf4j.Slf4j;
import my.practice.demo.domain.Guest;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class GuestBookService {


    private List<Guest> guests = new ArrayList<>();


    public boolean addGuest(Guest guest){
        log.info("Adding Guest: {} to guest book", guest);
        return guests.add(guest);
    }

    public boolean deleteGuest(Integer id){
        return guests.removeIf(guest->guest.getId()==id);
    }

    public void printGuest(){
        System.out.println(guests);
    }
}

package my.practice.demo.config;

import my.practice.demo.Service.GuestBookService;
import my.practice.demo.domain.Address;
import my.practice.demo.domain.AddressType;
import my.practice.demo.domain.Guest;
import org.springframework.context.annotation.Bean;

public class AppConfig {


    @Bean
    public GuestBookService guestBookService(){
        return new GuestBookService();
    }

    @Bean
    public Guest guest(){
        Guest guest = new Guest();
        guest.setId(123);
        return guest;
    }
    @Bean
    public Address address(){
        Address address = new Address();
        address.setAddresdType(AddressType.HOME);

        return address;
    }
}

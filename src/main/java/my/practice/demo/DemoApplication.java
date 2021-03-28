package my.practice.demo;

import my.practice.demo.Service.GuestBookService;
import my.practice.demo.config.AppConfig;
import my.practice.demo.domain.Guest;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        ApplicationContext run = new AnnotationConfigApplicationContext(AppConfig.class);

        Guest guest = run.getBean("guest", Guest.class);

        GuestBookService guestBookService = (GuestBookService)run.getBean("guestBookService");

        guestBookService.addGuest(guest);
        guestBookService.printGuest();


    }

}

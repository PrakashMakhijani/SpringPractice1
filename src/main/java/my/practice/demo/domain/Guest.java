package my.practice.demo.domain;


import lombok.Data;

@Data
public class Guest {

    private int id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Address address;
}

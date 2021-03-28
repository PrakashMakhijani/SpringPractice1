package my.practice.demo.domain;


import lombok.Data;

@Data
public class Address {

    private String id;
    private String postalCode;
    private AddressType addresdType;
    private String city;

}

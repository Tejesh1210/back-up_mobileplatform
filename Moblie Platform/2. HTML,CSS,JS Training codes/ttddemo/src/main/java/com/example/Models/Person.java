package com.example.Models;
import lombok.Data;

@Data // getter, setter, conctructor, toString
public class Person {
    private String name;
    private String phone_no;
    private String email;	
    private Address addr;

    // TODO: write the functionality for purchasing the parking pass
    public void purchaseParkingPass() 
    {
    }
}

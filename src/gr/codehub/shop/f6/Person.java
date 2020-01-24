package gr.codehub.shop.f6;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public abstract class Person {
    private String firstName;
    private String lastName;
    private Address address;
    private Date dob;

    public Person(){
    }

    public void setPersonData(String firstName, String lastName, Address address, Date dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.dob = dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                ", dob=" + dob +
                '}';
    }


   public   int sendCard(){
       System.out.println("Merry" +
               " Christmas");
       return 1;
   }

}

package gr.codehub.shop.f4;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Customer   {
    private String firstName;
    private String lastName;
    private Date dob;
    private String address;
    private String zip;
    private String vatCode;
    private String tel;
    private String email;
    private Date registerDate;

    public Customer(String firstName, String lastName, Date dob, String address,
                    String zip, String vatCode, String tel, String email) {
        this(firstName,lastName, email);
        this.dob = dob;
        this.address = address;
        this.zip = zip;
        this.vatCode = vatCode;
        this.tel = tel;
     }

    public Customer(String firstName, String lastName, String email) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Customer() {
        registerDate = new Date();
    }


    public int getAge(){
        Calendar customerDob= GregorianCalendar.getInstance();
        customerDob.setTimeInMillis(dob.getTime());
        Calendar today= GregorianCalendar.getInstance();
     //   return  today.get(Calendar.YEAR)-customerDob.get(Calendar.YEAR);

        int  currentYear= new Date().getYear();
       return currentYear-dob.getYear();

    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                ", address='" + address + '\'' +
                ", zip='" + zip + '\'' +
                ", vatCode='" + vatCode + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", registerDate=" + registerDate +
                '}';
    }

//    @Override
//    public int compareTo(Customer otherCustomer) {
//        return (this.lastName + " " + this.firstName)
//                .compareTo(otherCustomer.lastName + " " + otherCustomer.firstName);
//    }
}

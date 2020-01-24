package gr.codehub.shop.f6;

import java.util.Date;

public class Manager extends Employee {

    public String department;

    public Manager(){}

    public Manager(String firstName, String lastName, Address address,
                   Date dob, EmployeeStatus employeeStatus, String afm) {
        super(firstName, lastName, address, dob, employeeStatus, afm);
    }

    public Manager(String firstName, String lastName, Address address,
                   Date dob, EmployeeStatus employeeStatus,
                   String afm, String department) {
        super(firstName, lastName, address, dob, employeeStatus, afm);
        this.department = department;
    }

    @Override
    public String getFirstName()    {

        return "Manager:"+ super.getFirstName();
    }

    @Override
    public int sendCard(){
        System.out.print("Hello manager! ");
        super.sendCard();
        return 1;
    }



}

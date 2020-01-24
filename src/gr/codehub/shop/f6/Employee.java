package gr.codehub.shop.f6;

import java.util.Date;

public class Employee extends Person {

    private EmployeeStatus employeeStatus;
    private String afm;

    public Employee(){
       }

    public Employee(String firstName, String lastName, Address address, Date dob,
                    EmployeeStatus employeeStatus, String afm ) {

        super();
        super.setPersonData(firstName, lastName, address, dob);
        this.employeeStatus = employeeStatus;
        this.afm = afm;
    }

    @Override
    public String getFirstName()
    {
        return "Employee:"+ super.getFirstName();
    }

    public  void showLevel(){
        System.out.println("I work for my boss");
    }


}

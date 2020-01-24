package gr.codehub.shop.f6;

import java.util.Date;

public class Main {
    public static void main(String[] args) {


        Accounting ac = new Accounting();

        Person e1 = new Employee
                ("Dimitris","Iracleous",
                new Address("Alexandras 205","Athens","11525","Attica"),
                new Date( 100,0,1),
                        EmployeeStatus.JUNIOR,"00");


        Person e2 = new Employee
                ("John","SuperMan",
                        new Address("Alexandras 205","Athens","11525","Attica"),
                        new Date( 100,0,2),
                        EmployeeStatus.JUNIOR,"01");

        Manager m =new Manager ("Thomas","Varsamidis",
                new Address("Alexandras 205","Athens","11525","Attica"),
                new Date( 100,0,2),
                EmployeeStatus.JUNIOR,"01");


        ac.addNewElement(e1);
        ac.addNewElement(e2);
        ac.addNewElement(m);

        ac.showAll3();
       CardSendDto crd= ac.sendChristmasCard();




////
////
////   Person employee = new Employee();
////   Person manager =  new Manager();
////
////        employee.setFirstName("Thomas");
////        manager.setFirstName("John");
//
//        // System.out.println(employee.getFirstName());
//        // System.out.println(manager.getFirstName());
//
//
////   List<Person> staff= new ArrayList<>();
////
////   staff.add(employee);
////   staff.add(manager);
////
////
////   for (Person p:staff)
////   {
////       System.out.println(p.getFirstName());
////   }
//
//        Employee e = new Employee();
//        Manager m = new Manager();
//
//        Director d = new Director();
//
//
//
//        e.showLevel();
//        m.showLevel();
//        d.showLevel();
//        System.out.println("=================");
//        Employee testEmployee = new Director();
//        d.showLevel();
//   try {
//       Object o = d;
//       Point d2 = (Point) o;
//   }
//   catch(Exception ex)
//   {
//       System.out.println(ex.toString());
//
//   }
//        testEmployee.showLevel();
//    }
    }
}

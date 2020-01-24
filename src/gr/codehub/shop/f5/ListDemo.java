package gr.codehub.shop.f5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        Person p1 = new Person("Thomas", 22, 10000);
        Person p2 = new Person("Thomas", 25, 9000);
        Person p3 = new Person("John", 22, 8000);
        Person p4 = new Person("Maria", 27, 7000);
        Person p5 = new Person("Dimitris", 18,6000);
        Person p6 = new Person("Dimitris", 22,5000);
        Person p7 = new Person("Maria", 18, 4000);

        List<Person> allPersons = new ArrayList<>();
        allPersons.add(p1);
        allPersons.add(p2);
        allPersons.add(p3);
        allPersons.add(p4);
        allPersons.add(p5);
        allPersons.add(p6);
        allPersons.add(p7);
        allPersons.add(new Person("John", 18, 3000));

        showPersons(allPersons);
        Collections.sort(allPersons);
        System.out.println("====================");
        showPersons(allPersons);
        Collections.shuffle(allPersons);
        System.out.println("====================");
        showPersons(allPersons);

        System.out.println(p1.compareTo(p3));


    }

    private static void showPersons(List<Person> allPersons) {
        for (int i = 0; i < allPersons.size(); i++){
            Person person = allPersons.get(i);
            System.out.println(person.toString());
        }
    }

}

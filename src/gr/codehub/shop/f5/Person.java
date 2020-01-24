package gr.codehub.shop.f5;

public class Person implements Comparable<Person> {

    private String name;
    private int age;
    private double salary;

    public Person(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Person person) {
       int nameComparison = this.name.compareTo(person.name);
        if (nameComparison != 0){
            return nameComparison;
        }
        return this.age - person.age;
    }
}

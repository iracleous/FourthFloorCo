package gr.codehub.shop.f6;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class FinancialDepartment implements ICrudable<Employee>, IAggregation {
    private final int CURRENCY_DIGITS = 2;
    private final RoundingMode BUSINESS_ROUNDING_MODE = RoundingMode.HALF_DOWN;
    private List<Employee> employees;

    public FinancialDepartment() {
        employees = new ArrayList<>();
    }


    @Override
    public void addNewElement(Employee tau) {
        employees.add(tau);
    }

    @Override
    public Employee read(int index) {

        return employees.get(index);
    }

    @Override
    public void update(int index, Employee newT) {
        employees.set(index, newT);
    }

    @Override
    public void delete(int index) {
        employees.remove(index);
    }


    public long countValidSalary() {
        return employees
                .stream()
                .filter(p -> p != null && p.getSalary() != null)
                .count();
    }

    @Override
    public int count() {
        return employees.size();
    }

    @Override
    public BigDecimal sum() {
        return employees
                .stream()
                .map(p -> p.getSalary())
                .reduce(BigDecimal.ZERO, BigDecimal::add);

//        BigDecimal s=  BigDecimal.ZERO;
//        s. setScale(CURRENCY_DIGITS, BUSINESS_ROUNDING_MODE);
//
//        for(Employee e: employees){
//            BigDecimal salary = e.getSalary();
//            if (salary != null) {
//                s = s.add(salary);
//            }
//        }
//        return s;


    }

    @Override
    public BigDecimal average() {
        return sum().divide(
                new BigDecimal(countValidSalary()),
                CURRENCY_DIGITS, BUSINESS_ROUNDING_MODE);
    }

    @Override
    public BigDecimal min() {
        return employees
                .stream()
                .map(e -> e.getSalary())
                .min(BigDecimal::compareTo)
                .get();
    }

    @Override
    public BigDecimal max() {
        return employees
                .stream()
                .map(e -> e.getSalary())
                .max(BigDecimal::compareTo)
                .get();
    }
}

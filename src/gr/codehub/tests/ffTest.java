package gr.codehub.tests;

import gr.codehub.shop.f6.Employee;
import gr.codehub.shop.f6.FinancialDepartment;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ffTest {

    private FinancialDepartment financialDepartment;
    private Employee e;

    @BeforeEach
    void setUp() {
        financialDepartment= new FinancialDepartment();
        e = new Employee();
        financialDepartment.addNewElement(e);
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void addNewElement() {


        assertEquals(1,
                financialDepartment.count(), "must be 1");

    }



    @Test
    void sum() {



        e.setSalary(new BigDecimal("835.2"));

        assert   financialDepartment.sum().equals(new BigDecimal("835.2")) :
        "ërror";
    }


}
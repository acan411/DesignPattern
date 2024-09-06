package priv.acan.structural.composite.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author acan
 * @since 2022/12/17 15:08
 */
public class Employee {

    private final String name;
    private final String dept;
    private final int salary;
    private final List<Employee> subordinates = new ArrayList<>();

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", subordinates=" + subordinates +
                '}';
    }
}

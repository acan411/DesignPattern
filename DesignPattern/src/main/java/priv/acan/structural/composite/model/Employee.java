package priv.acan.structural.composite.model;

import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author acan
 * @since 2022/12/17 15:08
 */
@Builder
public class Employee {

    private final String name;
    private final String dept;
    private final int salary;

    @Getter
    private final List<Employee> subordinates = new ArrayList<>();

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
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

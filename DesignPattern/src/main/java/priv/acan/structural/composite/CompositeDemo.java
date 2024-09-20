package priv.acan.structural.composite;

import priv.acan.structural.composite.model.Employee;

/**
 * @author acan
 * @since 2022/12/17 15:12
 */
public class CompositeDemo {

    public static void main(String[] args) {

        Employee ceo = Employee.builder().name("John").dept("CEO").salary(30000).build();
        Employee headSales = Employee.builder().name("Robert").dept("Head Sales").salary(20000).build();
        Employee headMarketing = Employee.builder().name("Michel").dept("Head Marketing").salary(20000).build();
        Employee salesExecutive1 = Employee.builder().name("Richard").dept("Sales").salary(10000).build();
        Employee salesExecutive2 = Employee.builder().name("Rob").dept("Sales").salary(10000).build();
        Employee clerk1 = Employee.builder().name("Laura").dept("Marketing").salary(10000).build();
        Employee clerk2 = Employee.builder().name("Bob").dept("Marketing").salary(10000).build();

        ceo.add(headSales);
        ceo.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        // 打印该组织的所有员工
        System.out.println(ceo);
        for (Employee headEmployee : ceo.getSubordinates()) {
            System.out.println(headEmployee);
            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }
}

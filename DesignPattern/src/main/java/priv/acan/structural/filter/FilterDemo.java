package priv.acan.structural.filter;

import priv.acan.structural.filter.constant.Gender;
import priv.acan.structural.filter.constant.MaritalStatus;
import priv.acan.structural.filter.intf.Criteria;
import priv.acan.structural.filter.intf.impl.*;
import priv.acan.structural.filter.model.Person;

import java.util.Set;

/**
 * @author acan
 * @since 2022/12/17 14:25
 */
public class FilterDemo {

    public static void main(String[] args) {

        Set<Person> people = Set.of(
                Person.builder().name("Robert").gender(Gender.MALE).maritalStatus(MaritalStatus.SINGLE).build(),
                Person.builder().name("John").gender(Gender.MALE).maritalStatus(MaritalStatus.MARRIED).build(),
                Person.builder().name("Laura").gender(Gender.FEMALE).maritalStatus(MaritalStatus.MARRIED).build(),
                Person.builder().name("Diana").gender(Gender.FEMALE).maritalStatus(MaritalStatus.SINGLE).build(),
                Person.builder().name("Mike").gender(Gender.MALE).maritalStatus(MaritalStatus.SINGLE).build(),
                Person.builder().name("Bobby").gender(Gender.MALE).maritalStatus(MaritalStatus.SINGLE).build()
        );


        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();

        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males: ");
        printPersons(male.meetCriteria(people));
        System.out.println();

        System.out.println("Females: ");
        printPersons(female.meetCriteria(people));
        System.out.println();

        System.out.println("Singles: ");
        printPersons(single.meetCriteria(people));
        System.out.println();

        System.out.println("Single Males: ");
        printPersons(singleMale.meetCriteria(people));
        System.out.println();

        System.out.println("Single Or Females: ");
        printPersons(singleOrFemale.meetCriteria(people));
    }

    private static void printPersons(Set<Person> persons) {
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    + ", Gender : " + person.getGender()
                    + ", Marital Status : " + person.getMaritalStatus()
                    + " ]");
        }
    }
}

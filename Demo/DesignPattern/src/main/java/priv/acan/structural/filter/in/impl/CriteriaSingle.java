package priv.acan.structural.filter.in.impl;

import priv.acan.structural.filter.in.Criteria;
import priv.acan.structural.filter.model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author acan
 * @version 2022/12/17 14:17
 */
public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getMaritalStatus().equalsIgnoreCase("single")) {
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}

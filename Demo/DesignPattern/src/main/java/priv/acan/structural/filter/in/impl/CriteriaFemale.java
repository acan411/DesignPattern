package priv.acan.structural.filter.in.impl;

import priv.acan.structural.filter.in.Criteria;
import priv.acan.structural.filter.model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author acan
 * @version 2022/12/17 14:15
 */
public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("female")) {
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}

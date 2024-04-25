package priv.acan.structural.filter.in.impl;

import priv.acan.structural.filter.in.Criteria;
import priv.acan.structural.filter.model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author acan
 * @version 2022/12/17 14:13
 */
public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("male")) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}

package priv.acan.structural.filter.in.impl;

import lombok.AllArgsConstructor;
import priv.acan.structural.filter.in.Criteria;
import priv.acan.structural.filter.model.Person;

import java.util.List;

/**
 * @author acan
 * @version 2022/12/17 14:21
 */
@AllArgsConstructor
public class OrCriteria implements Criteria {

    private final Criteria firstCriteria;
    private final Criteria secondCriteria;

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaItems = firstCriteria.meetCriteria(persons);
        List<Person> secondCriteriaItems = secondCriteria.meetCriteria(persons);

        for (Person person : secondCriteriaItems) {
            if (firstCriteriaItems.contains(person)) {
                firstCriteriaItems.add(person);
            }
        }
        return firstCriteriaItems;
    }
}

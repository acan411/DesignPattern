package priv.acan.structural.filter.in.impl;

import lombok.AllArgsConstructor;
import priv.acan.structural.filter.in.Criteria;
import priv.acan.structural.filter.model.Person;

import java.util.List;

/**
 * @author acan
 * @since 2022/12/17 14:18
 */
@AllArgsConstructor
public class AndCriteria implements Criteria {

    private final Criteria firstCriteria;
    private final Criteria secondCriteria;

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaItems = firstCriteria.meetCriteria(persons);
        return secondCriteria.meetCriteria(firstCriteriaItems);
    }
}

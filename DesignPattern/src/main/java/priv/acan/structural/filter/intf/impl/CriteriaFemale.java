package priv.acan.structural.filter.intf.impl;

import priv.acan.structural.filter.constant.Gender;
import priv.acan.structural.filter.intf.Criteria;
import priv.acan.structural.filter.model.Person;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author acan
 * @since 2022/12/17 14:15
 */
public class CriteriaFemale implements Criteria {

    @Override
    public Set<Person> meetCriteria(Set<Person> people) {
        return people.stream()
                .filter(p -> Gender.FEMALE.equals(p.getGender()))
                .collect(Collectors.toSet());
    }
}

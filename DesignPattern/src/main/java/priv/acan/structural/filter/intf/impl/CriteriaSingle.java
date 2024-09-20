package priv.acan.structural.filter.intf.impl;

import priv.acan.structural.filter.constant.MaritalStatus;
import priv.acan.structural.filter.intf.Criteria;
import priv.acan.structural.filter.model.Person;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author acan
 * @since 2022/12/17 14:17
 */
public class CriteriaSingle implements Criteria {

    @Override
    public Set<Person> meetCriteria(Set<Person> people) {
        return people.stream()
                .filter(p -> MaritalStatus.SINGLE.equals(p.getMaritalStatus()))
                .collect(Collectors.toSet());
    }
}

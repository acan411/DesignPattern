package priv.acan.structural.filter.intf.impl;

import lombok.AllArgsConstructor;
import priv.acan.structural.filter.intf.Criteria;
import priv.acan.structural.filter.model.Person;

import java.util.Set;

/**
 * @author acan
 * @since 2022/12/17 14:21
 */
@AllArgsConstructor
public class OrCriteria implements Criteria {

    private final Criteria criteria1;
    private final Criteria criteria2;

    @Override
    public Set<Person> meetCriteria(Set<Person> people) {
        Set<Person> set = criteria1.meetCriteria(people);
        set.addAll(criteria2.meetCriteria(people));
        return set;
    }
}

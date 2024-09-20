package priv.acan.structural.filter.intf.impl;

import lombok.AllArgsConstructor;
import priv.acan.structural.filter.intf.Criteria;
import priv.acan.structural.filter.model.Person;

import java.util.Set;

/**
 * @author acan
 * @since 2022/12/17 14:18
 */
@AllArgsConstructor
public class AndCriteria implements Criteria {

    private final Criteria criteria1;
    private final Criteria criteria2;

    @Override
    public Set<Person> meetCriteria(Set<Person> people) {
        return criteria2.meetCriteria(criteria1.meetCriteria(people));
    }
}

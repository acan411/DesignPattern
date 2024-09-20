package priv.acan.structural.filter.intf;

import priv.acan.structural.filter.model.Person;

import java.util.Set;

/**
 * @author acan
 * @since 2022/12/17 14:12
 */
public interface Criteria {

    Set<Person> meetCriteria(Set<Person> persons);
}

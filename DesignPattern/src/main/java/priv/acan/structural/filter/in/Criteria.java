package priv.acan.structural.filter.in;

import priv.acan.structural.filter.model.Person;

import java.util.List;

/**
 * @author acan
 * @version 2022/12/17 14:12
 */
public interface Criteria {

    List<Person> meetCriteria(List<Person> persons);
}

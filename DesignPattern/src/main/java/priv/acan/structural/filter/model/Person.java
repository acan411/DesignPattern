package priv.acan.structural.filter.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author acan
 * @since 2022/12/17 14:10
 */
@Data
@AllArgsConstructor
public class Person {

    private String name;
    private String gender;
    private String maritalStatus;
}

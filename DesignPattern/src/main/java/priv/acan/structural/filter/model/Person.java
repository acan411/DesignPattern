package priv.acan.structural.filter.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import priv.acan.structural.filter.constant.Gender;
import priv.acan.structural.filter.constant.MaritalStatus;

/**
 * @author acan
 * @since 2022/12/17 14:10
 */
@Data
@Builder
public class Person {

    private String name;
    private Gender gender;
    private MaritalStatus maritalStatus;
}

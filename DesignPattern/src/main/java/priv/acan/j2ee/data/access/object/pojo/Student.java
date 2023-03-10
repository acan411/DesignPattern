package priv.acan.j2ee.data.access.object.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author acan
 * @version 2023/03/09 19:54
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private String name;
    private int rollNo;
}

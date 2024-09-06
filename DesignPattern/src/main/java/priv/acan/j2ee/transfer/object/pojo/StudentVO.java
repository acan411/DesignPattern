package priv.acan.j2ee.transfer.object.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author acan
 * @since 2023/03/10 20:18
 */
@Data
@AllArgsConstructor
public class StudentVO {

    private String name;
    private int rollNo;
}

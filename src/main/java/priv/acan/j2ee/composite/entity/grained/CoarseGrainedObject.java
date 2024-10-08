package priv.acan.j2ee.composite.entity.grained;

import priv.acan.j2ee.composite.entity.model.DependentObject1;
import priv.acan.j2ee.composite.entity.model.DependentObject2;

/**
 * @author acan
 * @since 2023/03/09 17:45
 */
public class CoarseGrainedObject {

    private final DependentObject1 do1 = new DependentObject1();
    private final DependentObject2 do2 = new DependentObject2();

    public void setData(String data1, String data2) {
        do1.setData(data1);
        do2.setData(data2);
    }

    public String[] getData() {
        return new String[]{do1.getData(), do2.getData()};
    }
}

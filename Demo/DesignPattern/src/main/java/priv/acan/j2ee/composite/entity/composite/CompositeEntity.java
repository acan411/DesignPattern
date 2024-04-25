package priv.acan.j2ee.composite.entity.composite;

import priv.acan.j2ee.composite.entity.grained.CoarseGrainedObject;

/**
 * @author acan
 * @version 2023/03/09 17:52
 */
public class CompositeEntity {

    private final CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String data1, String data2) {
        cgo.setData(data1, data2);
    }

    public String[] getData() {
        return cgo.getData();
    }
}

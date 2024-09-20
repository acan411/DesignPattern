package priv.acan.j2ee.composite.entity.context;

import priv.acan.j2ee.composite.entity.composite.CompositeEntity;

/**
 * @author acan
 * @since 2023/03/09 17:53
 */
public class Client {

    private final CompositeEntity ce = new CompositeEntity();

    public void setData(String data1, String data2) {
        ce.setData(data1, data2);
    }

    public void getData() {
        String[] data = ce.getData();
        for (String datum : data) {
            System.out.println("Data: " + datum);
        }
    }
}

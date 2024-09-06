package priv.acan.j2ee.composite.entity.context;

import priv.acan.j2ee.composite.entity.composite.CompositeEntity;

/**
 * @author acan
 * @since 2023/03/09 17:53
 */
public class Client {

    private final CompositeEntity compositeEntity = new CompositeEntity();

    public void printData() {
        for (int i = 0; i < compositeEntity.getData().length; i++) {
            System.out.println("Data: " + compositeEntity.getData()[i]);
        }
    }

    public void setData(String data1, String data2) {
        compositeEntity.setData(data1, data2);
    }
}

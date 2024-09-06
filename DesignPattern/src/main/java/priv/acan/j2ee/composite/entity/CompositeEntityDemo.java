package priv.acan.j2ee.composite.entity;

import priv.acan.j2ee.composite.entity.context.Client;

/**
 * @author acan
 * @since 2023/03/09 17:56
 */
public class CompositeEntityDemo {

    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        client.setData("Second Test", "Data1");
        client.printData();
    }
}

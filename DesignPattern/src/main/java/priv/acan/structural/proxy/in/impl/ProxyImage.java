package priv.acan.structural.proxy.in.impl;

import priv.acan.structural.proxy.in.Image;

/**
 * @author acan
 * @version 2022/12/17 23:52
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private final String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}

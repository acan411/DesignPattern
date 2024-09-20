package priv.acan.structural.proxy.intf.impl;

import lombok.Builder;
import priv.acan.structural.proxy.intf.Image;

/**
 * @author acan
 * @since 2022/12/17 23:52
 */
@Builder
public class ProxyImage implements Image {

    private RealImage realImage;

    private final String fileName;

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}

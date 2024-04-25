package priv.acan.structural.proxy.in.impl;

import priv.acan.structural.proxy.in.Image;

/**
 * @author acan
 * @version 2022/12/17 23:51
 */
public class RealImage implements Image {

    private final String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("RealImage::display() " + fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("RealImage::loadFromDisk() " + fileName);
    }
}

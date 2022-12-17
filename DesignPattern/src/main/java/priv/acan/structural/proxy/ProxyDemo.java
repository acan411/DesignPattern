package priv.acan.structural.proxy;

import priv.acan.structural.proxy.in.Image;
import priv.acan.structural.proxy.in.impl.ProxyImage;

/**
 * @author acan
 * @version 2022/12/17 23:59
 */
public class ProxyDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");

        // 图像从磁盘加载
        image.display();
        // 图像不需要从磁盘加载
        image.display();
    }
}

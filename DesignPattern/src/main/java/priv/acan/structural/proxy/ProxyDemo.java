package priv.acan.structural.proxy;

import priv.acan.structural.proxy.intf.Image;
import priv.acan.structural.proxy.intf.impl.ProxyImage;

/**
 * @author acan
 * @since 2022/12/17 23:59
 */
public class ProxyDemo {

    public static void main(String[] args) {
        Image image = ProxyImage.builder()
                .fileName("test.jpg")
                .build();

        // 图像从磁盘加载
        image.display();

        System.out.println();

        // 图像不需要从磁盘加载
        image.display();
    }
}

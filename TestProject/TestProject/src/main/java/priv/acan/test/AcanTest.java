package priv.acan.test;

import org.junit.Test;

/**
 * @author acan
 * @version 2022/12/17 23:44
 */
public class AcanTest {

    @Test
    public void asdf() {
        for (int i = 0; i < 100; ++i) {
            double v = Math.random() * 10;
            System.out.println(v);
            System.out.println((int) (v));
        }
    }
}

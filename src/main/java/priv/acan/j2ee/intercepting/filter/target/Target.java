package priv.acan.j2ee.intercepting.filter.target;

/**
 * @author acan
 * @since 2023/03/09 20:45
 */
public class Target {
    public void execute(String request) {
        System.out.println("Executing request: " + request);
    }
}

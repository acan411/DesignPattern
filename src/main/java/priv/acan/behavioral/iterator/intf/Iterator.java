package priv.acan.behavioral.iterator.intf;

/**
 * @author acan
 * @since 2022/12/26 03:39
 */
public interface Iterator<T> {

    boolean hasNext();

    T next();
}

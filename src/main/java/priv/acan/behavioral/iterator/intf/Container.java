package priv.acan.behavioral.iterator.intf;

/**
 * @author acan
 * @since 2022/12/26 03:40
 */
public interface Container<T> {

    Iterator<T> getIterator();
}

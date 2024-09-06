package priv.acan.behavioral.iterator.intf.impl;

import lombok.AllArgsConstructor;
import priv.acan.behavioral.iterator.intf.Container;
import priv.acan.behavioral.iterator.intf.Iterator;

/**
 * @author acan
 * @since 2022/12/26 03:40
 */
public record NameRepository<T>(T[] names) implements Container<T> {

    @Override
    public Iterator<T> getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator<T> {
        int index = 0;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public T next() {
            if (hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}

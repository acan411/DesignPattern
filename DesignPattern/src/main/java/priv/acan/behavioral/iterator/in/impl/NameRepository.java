package priv.acan.behavioral.iterator.in.impl;

import priv.acan.behavioral.iterator.in.Container;
import priv.acan.behavioral.iterator.in.Iterator;

/**
 * @author acan
 * @version 2022/12/26 03:40
 */
public class NameRepository implements Container {

    public final String[] names = {"Robert", "John", "Julie", "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index = 0;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}

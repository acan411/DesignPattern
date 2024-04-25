package priv.acan.behavioral.iterator;

import priv.acan.behavioral.iterator.in.Iterator;
import priv.acan.behavioral.iterator.in.impl.NameRepository;

/**
 * @author acan
 * @version 2022/12/26 03:44
 */
public class IteratorDemo {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for (Iterator iter = namesRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }
}

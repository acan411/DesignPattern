package priv.acan.behavioral.iterator;

import priv.acan.behavioral.iterator.intf.Iterator;
import priv.acan.behavioral.iterator.intf.impl.NameRepository;

/**
 * @author acan
 * @since 2022/12/26 03:44
 */
public class IteratorDemo {

    public static void main(String[] args) {
        String[] names = {"Robert", "John", "Julie", "Lora"};
        NameRepository<String> namesRepository = new NameRepository<>(names);

        for (Iterator<String> iter = namesRepository.getIterator(); iter.hasNext(); ) {
            String name = iter.next();
            System.out.println("Name : " + name);
        }
    }
}

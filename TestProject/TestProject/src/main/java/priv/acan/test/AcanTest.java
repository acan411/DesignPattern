package priv.acan.test;

import lombok.Data;
import org.junit.Test;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

/**
 * @author acan
 * @version 2022/12/17 23:44
 */
@Data
class Student implements Serializable {
    private String name;
    private Teacher teacher;

    public Object deepCopy() {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(baos)) {
            oos.writeObject(this);
            try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()))) {
                return ois.readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

@Data
class Teacher implements Serializable {
    private String name;
}

public class AcanTest {

    @Test
    public void adsklfjl() throws Exception {
        Teacher teacher = new Teacher();
        teacher.setName("aaa");
        Student student = new Student();
        student.setName("bbb");
        student.setTeacher(teacher);
        Student clone = (Student) student.deepCopy();
        Teacher cloneTeacher = clone.getTeacher();
        System.out.println(cloneTeacher.getName());
        System.out.println(student == clone);
        System.out.println(teacher == cloneTeacher);
    }

    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable(100);
        Thread t1 = new Thread(mr, "t1");
        Thread t2 = new Thread(mr, "t2");
        Thread t3 = new Thread(mr, "t3");

        t1.start();
        t2.start();
        t3.start();
    }

    @Test
    public void aslkjfl() {
        List<Integer> collect = Stream.iterate(0, i -> ++i)
                .skip(10)
                .limit(50)
                .toList();
        System.out.println(collect);
    }

    @Test
    public void asdklfj() {
        Object o = new Object();
    }

    @Test
    public void aklsdjgkl() {
        int cnt = 2000000014;
        for (int i = 2; cnt != 1; ) {
            if (cnt % i == 0) {
                System.out.print(i + " ");
                cnt /= i;
            } else if (i > cnt / i) {
                i = cnt;
            } else {
                ++i;
            }
        }

    }

    @Test
    public void asdf() {
        int i = 0;

        System.out.println(1);
        Cache cache = new Cache();
        cache.getDigit(i);

        System.out.println(2);
        Cache cache1 = new Cache();
        cache1.getDigit(i);
    }
}

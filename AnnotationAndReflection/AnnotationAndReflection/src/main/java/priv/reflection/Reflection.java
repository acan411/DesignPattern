package priv.reflection;

import lombok.Data;
import org.junit.Test;

public class Reflection {

    /**
     * 反射的获取
     */
    @Test
    public void asdf() throws ClassNotFoundException {

        // 通过反射获取类的class对象
        // 1. 通过forName获得
        Class<?> c1 = Class.forName("priv.reflection.User");
        // 2. 通过对象获得
        User user = new User();
        Class<? extends User> c2 = user.getClass();
        // 3. 通过类名获得
        Class<User> c3 = User.class;
        // 4. 基本数据类型的包装类都有一个Type属性
        Class<Integer> c4 = Integer.TYPE;

        // 一个类被加载后, 类的整个结构都会被封装在Class对象中
        System.out.println(c1 + " " + c4);

        // 一个类在内存中只有一个Class对象
        System.out.println(c1.hashCode() + " " + c2.hashCode() + " " + " " + c4.hashCode());

        // 获得父类类型
        Class<?> c5 = c3.getSuperclass();
        System.out.println(c5);
    }

    /**
     * 测试类加载顺序
     */
    static {
        System.out.println("主类加载");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        // 主动引用发生类加载
//        Son son = new Son();

        // forName发生类加载
//        Class<?> aClass = Class.forName("priv.reflection.Son");

        // 通过类名获得不发生类加载
//        Class<Son> sonClass = Son.class;

        // 子类调用父类静态对象不发生类引用
//        System.out.println(Son.b);

        // 数组声明只开辟空间, 不发生类加载
//        Son[] sons = new Son[6];

        // 引用常量不发生类加载
//        System.out.println(Son.n);
    }
}

@Data
class User {
    private String name;
    private int id;
    private int age;
}

@Data
class Father {
    static int b = 2;

    static {
        System.out.println("父类加载");
    }
}

class Son extends Father {
    static {
        System.out.println("子类加载");
        m = 300;
    }

    static int m = 100;
    static final int n = 1;
}

// 创建对象的方根
// new
// clone
// reflection
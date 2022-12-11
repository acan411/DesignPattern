package priv.annotation;

import java.lang.annotation.*;

public class Annotation {

    /**
     * 内置注解
     */
    @Override // 重写父类方法
    @Deprecated // 可以使用但不推荐使用, 或存在更好的方式
    @SuppressWarnings("all") // 镇压警告
    public String toString() {
        return "Annotation{}";
    }

    /**
     * 自定义注解
     */
    @MyAnnotation() // 注解可以显示赋值
    public void asdf() {

    }
}

/**
 * 元注解, 用于定义一个注解
 */
@Inherited // 说明子类可以继承父类中的该注解
@Documented // 说明该注解将被包含在javadoc中
@Target(value = {ElementType.METHOD, ElementType.TYPE}) // 作用域, 用于描述注解的适用范围
@Retention(RetentionPolicy.RUNTIME) // 用于描述注解的生命周期, 表示需要在什么级别保存该注释信息 (source < class < runtime)
@interface MyAnnotation {
    // 注解的参数定义
    String value() default ""; //默认值可省略, 只有一个参数使用value
}

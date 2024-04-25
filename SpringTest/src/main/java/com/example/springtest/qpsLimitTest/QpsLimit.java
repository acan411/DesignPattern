package com.example.springtest.qpsLimitTest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author acan
 * @version 2023/12/09 13:46
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface QpsLimit {
    String key() default "";

    int permitsPerSecond();

    long timeout();
}


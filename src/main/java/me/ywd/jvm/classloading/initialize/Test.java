package me.ywd.jvm.classloading.initialize;

/**
 * Understanding JVM - page 225
 *
 * @Author Ye_Wenda
 * @Date 8/10/2017
 */
public class Test {
    static {
        i = 0;
        // illegal forward reference.
//        System.out.println(i);
    }
    static int i = 1;
}

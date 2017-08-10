package me.ywd.jvm.classloading.passive.refA;

/**
 * @Author Ye_Wenda
 * @Date 8/8/2017
 */
public class SubClass extends SuperClass {
    static {
        System.out.println("Sub init...");
    }
}

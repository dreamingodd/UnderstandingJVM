package me.ywd.jvm.classloading.passive.refA;

/**
 * @Author Ye_Wenda
 * @Date 8/8/2017
 */
public class SuperClass {
    static {
        System.out.println("Super init...");
    }
    public static int value = 100;
}

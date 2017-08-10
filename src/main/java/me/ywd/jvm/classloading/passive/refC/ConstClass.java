package me.ywd.jvm.classloading.passive.refC;

/**
 * @Author Ye_Wenda
 * @Date 8/10/2017
 */
public class ConstClass {
    static {
        System.out.println("ConstClass init");
    }

    public static final String CONSTANT = "constant";
}

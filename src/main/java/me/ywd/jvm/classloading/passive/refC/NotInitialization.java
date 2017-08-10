package me.ywd.jvm.classloading.passive.refC;

/**
 * Understanding JVM - page 213
 *
 * @Author Ye_Wenda
 * @Date 8/10/2017
 */
public class NotInitialization {
    public static void main(String[] args) {
        System.out.println(ConstClass.CONSTANT);
    }
}

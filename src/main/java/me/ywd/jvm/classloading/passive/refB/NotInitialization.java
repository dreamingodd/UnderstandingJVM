package me.ywd.jvm.classloading.passive.refB;

import me.ywd.jvm.classloading.passive.refA.SuperClass;

/**
 * Understanding JVM - page 212
 *
 * @Author Ye_Wenda
 * @Date 8/10/2017
 */
public class NotInitialization {
    public static void main(String[] args) {
        SuperClass[] sca = new SuperClass[10];
    }
}

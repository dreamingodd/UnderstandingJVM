package me.ywd.jvm.classloading.passive.refA;

/**
 * Understanding JVM - page 211
 * Passive Reference Example A -
 *   通过子类引用父类的静态变量不会触发<strong>子类</strong>的初始化
 *
 * VM Options -
 * -XX:+TraceClassLoading
 * @Author Ye_Wenda
 * @Date 8/8/2017
 */
public class NotInitialization {
    public static void main(String[] args) {
        System.out.println(SubClass.value);
    }
}

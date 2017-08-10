package me.ywd.jvm.classloading.parse;

/**
 * Understanding JVM - page 223
 * 结果与书中不符，编译器规则可能有修改
 * @Author Ye_Wenda
 * @Date 8/10/2017
 */
public class ParseField {
    interface In0 {
        int A = 0;
    }
    interface In1 extends In0 {
        int A = 1;
    }
    interface In2 extends In1 {
        int A = 2;
    }

    static class Parent implements In1 {
        public static int A = 3;
    }
    static class Sub extends Parent {
//        public static int A = 4;
    }

    public static void main(String[] args) {
        System.out.println(Sub.A);
    }
}

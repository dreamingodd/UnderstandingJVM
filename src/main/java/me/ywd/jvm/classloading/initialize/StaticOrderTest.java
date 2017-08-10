package me.ywd.jvm.classloading.initialize;

/**
 * Understanding JVM - page 226
 *
 * @Author Ye_Wenda
 * @Date 8/10/2017
 */
public class StaticOrderTest {

    static class Parent {
        public static int A = 1;
        static {
            A = 2;
        }
    }

    static class Sub extends Parent {
        public static int B = A;
    }

    public static void main(String[] args) {
        System.out.println(Sub.B);
    }
}

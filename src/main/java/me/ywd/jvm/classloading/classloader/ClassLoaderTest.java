package me.ywd.jvm.classloading.classloader;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author Ye_Wenda
 * @Date 8/11/2017
 */
public class ClassLoaderTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        ClassLoader ywdLoader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                String fileName = name.substring(name.lastIndexOf(".") + 1) + ".class";
                InputStream is = getClass().getResourceAsStream(fileName);
                if (is == null) {
                    return super.loadClass(name);
                }
                try {
                    byte[] bytes = new byte[is.available()];
                    is.read(bytes);
                    return defineClass(name, bytes, 0, bytes.length);
                } catch (IOException e) {
                    throw new ClassNotFoundException(name);
                }
            }
        };

        // (ClassLoaderTest) 强制转换也不行
        // ？？？？？？？？？？？？？？？？？？？？？？？
        // 若ClassLoaderTest 进入自定义loadClass方法四次
        // 若Test            进入系定义loadClass方法两次
        Object obj = ywdLoader.loadClass("me.ywd.jvm.classloading.classloader.Test").newInstance();
        System.out.println(obj.getClass());
        System.out.println(obj instanceof Test);
    }
}


package me.ywd.jvm.memory.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * VM options: -XX:+PrintGCDetails -XX:PermSize=10M -XX:MaxPermSize=10M
 * 我用1.8就一直循环下去了，可能因为永久代在1.8中已经转换成了Metaspace，
 * @author ye
 */
public class RuntimeConstantPoolOom {

    /**
     * @param args the command line arguments
     * Exception in thread "main" java.lang.OutOfMemoryError: PermGen space
     */
    public static void main(String[] args) {
        // 使用List保持着常量池引用，避免Full GC回收常量池行为
        List<String> list = new ArrayList<String>();
        int i = 0;
        while (true) {
            list.add(String.valueOf(i++).intern());
        }
    }
    
}

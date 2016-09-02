
package memory.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * VM options: -XX:+PrintGCDetails -XX:PermSize=10M -XX:MaxPermSize=10M
 * @author ye
 */
public class RuntimeConstantPoolOom {

    /**
     * @param args the command line arguments
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

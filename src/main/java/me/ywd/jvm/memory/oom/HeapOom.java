
package me.ywd.jvm.memory.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * VM options: -verbose:me.ywd.jvm.gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
 * 
 * @author ye
 */
public class HeapOom {

    static class OomObject {
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        List<OomObject> list = new ArrayList<OomObject>();
        int i = 0;
        try {
            while (true) {
                list.add(new OomObject());
                i++;
                if (i % 100000 == 0) {
                    System.out.println(i);
                }
            }
        } catch (Exception e) {
            System.out.println(i);
            throw e;
        }
    }
    
}

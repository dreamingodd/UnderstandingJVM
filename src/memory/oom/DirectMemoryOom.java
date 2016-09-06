/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory.oom;

import java.lang.reflect.Field;

import sun.misc.Unsafe;

/**
 * VM args: -XX:+PrintGCDetails -Xmx20M -XX:MaxDirectMemorySize=10M
 * @author ye
 */
public class DirectMemoryOom {

    private static final int _1MB = 1024*1024;

    public static void main(String[] args)throws Exception {
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe)unsafeField.get(null);
        while (true) {
            unsafe.allocateMemory(_1MB);
        }
    }


}
/*
[GC (Allocation Failure) [PSYoungGen: 507K->504K(1024K)] 507K->512K(14848K), 0.0005149 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
Exception in thread "main" java.lang.OutOfMemoryError
    at sun.misc.Unsafe.allocateMemory(Native Method)
    at memory.oom.DirectMemoryOom.main(DirectMemoryOom.java:26)
Heap
 PSYoungGen      total 1024K, used 750K [0x00000000ff980000, 0x00000000ffb80000, 0x0000000100000000)
  eden space 512K, 48% used [0x00000000ff980000,0x00000000ff9bd8e8,0x00000000ffa00000)
  from space 512K, 98% used [0x00000000ffa00000,0x00000000ffa7e030,0x00000000ffa80000)
  to   space 512K, 0% used [0x00000000ffb00000,0x00000000ffb00000,0x00000000ffb80000)
 ParOldGen       total 13824K, used 8K [0x00000000fec00000, 0x00000000ff980000, 0x00000000ff980000)
  object space 13824K, 0% used [0x00000000fec00000,0x00000000fec02000,0x00000000ff980000)
 Metaspace       used 2620K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 281K, capacity 386K, committed 512K, reserved 1048576K
*/
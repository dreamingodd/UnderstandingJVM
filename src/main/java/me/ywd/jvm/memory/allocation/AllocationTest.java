package me.ywd.jvm.memory.allocation;



/**
 * 
 * 
 * 
 * @author AOC3
 *
 */
public class AllocationTest {
    
    public final int _MB = 1024*1024;

    // VM args: -verbose:me.ywd.jvm.gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio:8
    public void testAllocation() {
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[2 * _MB];
        allocation2 = new byte[2 * _MB];
        allocation3 = new byte[2 * _MB];

        allocation4 = new byte[4 * _MB];

    }

    // VM args: -verbose:me.ywd.jvm.gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio:8 -XX:PretenureSizeThreshold=3145728
    public void testPretenureSizeThreshold() {

        byte[] allocation4 = new byte[4 * _MB];
    }

    // VM args: -verbose:me.ywd.jvm.gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio:8 -XX:MaxTenuringThreshold=1
    private void testTenuringThreshold() {
        byte[] allocation1, allocation2, allocation3;
        allocation1 = new byte[_MB / 4];
        allocation2 = new byte[4 * _MB];
        allocation3 = new byte[4 * _MB];
//        System.me.ywd.jvm.gc();
        allocation3 = null;
        allocation3 = new byte[4 * _MB];
    }

    // VM args: -verbose:me.ywd.jvm.gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio:8 -XX:MaxTenuringThreshold=15
    private void testTenuringThreshold2() {
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[_MB / 4];
        allocation2 = new byte[_MB / 4];
        allocation3 = new byte[4 * _MB];
        allocation4 = new byte[4 * _MB];
        allocation4 = null;
        allocation4 = new byte[4 * _MB];
    }

    // -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio:8 -XX:HandlePromotionFailure=true
    private void testHandlePromotion() {
        byte[] allocation1, allocation2, allocation3, allocation4, allocation5, allocation6, allocation7;
        allocation1 = new byte[2 * _MB];
        allocation2 = new byte[2 * _MB];
        allocation3 = new byte[2 * _MB];
        allocation1 = null;
        allocation4 = new byte[2 * _MB];
        allocation5 = new byte[2 * _MB];
        allocation6 = new byte[2 * _MB];
        allocation4 = null;
        allocation5 = null;
        allocation6 = null;
        allocation7 = new byte[2 * _MB];

    }

    public static void main(String[] args) {
        AllocationTest at = new AllocationTest();
//        at.testAllocation();
//        at.testPretenureSizeThreshold();
        at.testTenuringThreshold();
        
    }
}


package me.ywd.jvm.memory.sof;

/**
 * VM options: -XX:+PrintGCDetails -Xss228k
 * 
 * @author ye
 */
public class JavaVmStackSof {

    private int stackLength = 1;
    
    public void stackLeak() {
        if (stackLength % 100 == 0) {
            System.out.println(stackLength);
        }
        stackLength++;
        stackLeak();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        JavaVmStackSof sof = new JavaVmStackSof();
        try {
            sof.stackLeak();
        } catch(Exception e) {
            System.out.println("stack length: " + sof.stackLength);
            throw e;
        }
    }
    
}

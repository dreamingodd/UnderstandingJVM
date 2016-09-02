/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory.oom;

/**
 * VM options: -XX:+PrintGCDetails -Xss10m
 * 
 * @author ye
 */
public class JavaVmStackOom {
    
    private void dontStop() {
        while (true) {
        }
    }
    
    public void stackLeakByThread() {
        while (true) {
            Thread thread = new Thread(new Runnable() {
               public void run() {
                   dontStop();
               } 
            });
            thread.start();
        }
    }
    
    public static void main(String[] args)throws Exception{
        JavaVmStackOom oom = new JavaVmStackOom();
        oom.stackLeakByThread();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package me.ywd.jvm.memory;

/**
 *
 * @author ye
 */
public class InternTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1 = new StringBuilder("闻达").toString();
        System.out.println(s1.intern() == s1);
        String s2 = new StringBuilder("ii").append("jj").toString();
        System.out.println(s2.intern() == s2);
        
//        String s3 = "abc";
        String s4 = new String("abc");
//        System.out.println(s3 == s4.intern());
        System.out.println(s4 == s4.intern());
    }
    
}

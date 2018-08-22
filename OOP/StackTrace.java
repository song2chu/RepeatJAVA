/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**
 *
 * @author safev
 */
public class StackTrace {
    public static void main(String[] args) {
        method1();
    }
    public static StackTraceElement[] method1(){
        method2();
        return Thread.currentThread().getStackTrace();
    }
    
    public static StackTraceElement[] method2(){
        method3();
        return Thread.currentThread().getStackTrace();
    }
    
    public static StackTraceElement[] method3(){
        return Thread.currentThread().getStackTrace();
    }
}

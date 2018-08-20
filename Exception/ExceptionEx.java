/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

/**
 *
 * @author safev
 */
public class ExceptionEx {
    public static void main(String[] args) {
        try {
            int num =5/0;
        } catch (Exception e) {
            System.out.println("Can't be Devided by zero");
        }
    }
}

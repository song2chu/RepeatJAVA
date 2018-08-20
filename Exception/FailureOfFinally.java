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
public class FailureOfFinally {
    public static void main(String[] args) {
        try{
            System.exit(1);
        }finally{
            System.err.println("Finally");
        }
    }
}

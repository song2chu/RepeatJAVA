/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;
import java.util.HashMap;

/**
 *
 * @author safev
 */
public class NullPointerException {
    public static void main(String[] args) {
        try {
            HashMapString, String> map = new HashMapString, String>(null)
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutput;
import java.util.Scanner;
/**
 *
 * @author safev
 */
public class ScannerEx {
    public static void main(String[] args) {
        System.out.print("Enter: ");
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.print("You're Enter: "+str);
        
    }
}

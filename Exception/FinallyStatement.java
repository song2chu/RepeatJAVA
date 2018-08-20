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
public class FinallyStatement {
    public static void main(String[] args) {
        int[] array = new int[5];
        try {
            for (int i = 0; i < 6; i++) {
                array[i] = i;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Array is out of Bounds");
        }finally{
            System.out.println("This is Finally");
        }
    }
}

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
public class MultiCatch {
    public static void main(String[] args) {
        int[] number = {4,8,16,32,128,256,512};
        int[] denum ={2,0,4,4,0,8};
        for(int i=0;i<number.length;i++){
            try {
                System.out.println((number[i]+" / "+denum[i]+" = "+number[i]/denum[i]));
            } catch (ArithmeticException e) {
                System.out.println("Can't devieded");
            }catch(IndexOutOfBoundsException e){
                System.out.println("Out of Bounds");
            }
        }
    }
}

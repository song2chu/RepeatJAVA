
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author safev
 */
public class SumOfElementArray {

    public static void main(String[] args) {
        int[] array = new int[10];
        long sum = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextInt(10000);
        }
        for (int i = 0; i < array.length; i++) {
            sum = sum+array[i];
        }
        System.out.println("Sum ="+sum);

    }
}

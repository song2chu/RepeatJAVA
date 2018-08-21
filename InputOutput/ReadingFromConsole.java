/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author safev50
 */
public class ReadingFromConsole {
    public static void main(String[] args) throws IOException{
        System.out.println("Enter TEXT: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str =  reader.readLine();
        System.out.print("You Enter: "+str);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author safev
 */
public class Ascii {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter: ");
        String path = reader.readLine();
        
        File myFolder = new File(path);
        File[] folder = myFolder.listFiles();
        
        for (int i = 0; i < folder.length; i++) {
            if (folder[i].isDirectory()) {
                System.out.println(folder[i]);
                
            }
        }
    }
}

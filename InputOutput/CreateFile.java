/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutput;
import java.io.File;
import java.io.IOException;
/**
 *
 * @author safev
 */
public class CreateFile {
    public static void main(String[] args) {
        try {
            File file = new File("d:/safe1.txt");
            boolean isCreate = file.createNewFile();
            if (isCreate) {
                System.out.println("Created");
            }else{
                System.out.println("Can't Create");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

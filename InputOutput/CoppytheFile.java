/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author safev
 */
public class CoppytheFile {
    public static void main(String[] args) throws IOException{
        
        FileInputStream fis = new FileInputStream("d:/safe.txt");
        FileOutputStream fos = new FileOutputStream("d:/safecopy2.txt");
        
        if (fis.available()>0) {
            byte[] buffer = new byte[fis.available()];
            int count = fis.read(buffer);
            fos.write(buffer,0,count);
        }
        
        fis.close();
        fos.close();
    }
}

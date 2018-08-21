/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutput;
import java.io.File;
/**
 *
 * @author safev
 */
public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("d:/safe1.txt");
        boolean isDelete =  file.delete();
        if (isDelete) {
            System.out.println("Deleted");
        }else{
            System.out.println("File didn't delete");
        }
    }
}

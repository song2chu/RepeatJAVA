/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author safev
 */
public class InheritedException {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("Filename");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException caught");
        }catch(IOException e){
            System.out.println("IO caught");
        }catch(Exception e){
            System.out.println("Exception catch");
        }
    }
}

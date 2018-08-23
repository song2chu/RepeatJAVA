/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasic;
import java.io.File;
/**
 *
 * @author safev
 */
public class ManageFolder {
    private String part;
    
    public ManageFolder(String part){
        this.part=part;
    }
    
    public boolean isCreateFolder(String part){
        boolean result = false;
        File folder = new File(part);
        if (folder.mkdir()) {
            result=true;
        }else{
            result=false;
        }
        return result;
    }
    
    public boolean isDeleteFolder(){
        boolean result = false;
        File folder = new File(part);
        if (folder.delete()) {
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}

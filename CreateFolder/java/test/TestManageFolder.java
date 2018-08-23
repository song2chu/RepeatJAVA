/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import javabasic.ManageFolder;
/**
 *
 * @author safev
 */
public class TestManageFolder {
    public static void main(String[] args) {
        int id =2;
        String path =   "D:/NetbeanLearn/CreateFolder/web/images/img_"+id;
        ManageFolder mf = new ManageFolder(path);
        if (mf.isDeleteFolder()) {
            System.out.println("Finish");
        }else{
            System.out.println("Can't");
        }
    }
}

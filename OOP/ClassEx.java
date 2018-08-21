/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**
 *
 * @author safev
 */
public class ClassEx {
    public int floors;
    public int occupants;
    
    public static void main(String[] args) {
        ClassEx ce = new ClassEx();
        ce.floors = 5;
        ce.occupants = 15;
        System.out.println("ClassEX have : "+ce.floors+"Floors "+ce.occupants+"  OCc");
    }
}

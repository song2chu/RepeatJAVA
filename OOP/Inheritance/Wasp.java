/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.Inheritance;

/**
 *
 * @author safev
 */


//มดตะนอบ
public class Wasp extends Insect{
    
    public Wasp(int size, String color) {
        super(size, color);
    }
    
    public void move(){
        super.move();
        System.out.println("Wasp Fly");
    }
    
    public void attack(){
        super.attack();
        System.out.println("Wasp Punch");
    }
    
}

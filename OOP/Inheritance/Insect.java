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

//Class Inheritance EX
public class Insect {
    private int size;
    private String color;
    
    public Insect(int size, String color){
        this.size=size;
        this.color=color;
    }
    
    public void move(){
        System.out.println("Bug Move! ");
    }
    
    public void attack(){
        System.out.println("Bug KICK! ");
    }
    
}

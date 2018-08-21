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
public class ConstructorsOverloading {
    public String name;
    public String model;
    public String color;

    public ConstructorsOverloading() {
    }

    public ConstructorsOverloading(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public ConstructorsOverloading(String name, String model, String color) {
        this.name = name;
        this.model = model;
        this.color = color;
    }
    
    public static void main(String[] args) {
        ConstructorsOverloading c1 = new ConstructorsOverloading();
        ConstructorsOverloading c2 = new ConstructorsOverloading("A", "RED");
        ConstructorsOverloading c3 = new ConstructorsOverloading("SAFEF", "B", "BULE");
    }
}

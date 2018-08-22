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
public class EnumOutput {
    //Months
    
    enum Months{
        JAN,
        FEB,
        MAR,
        APR,
        MAY,
        JUNE,
        JULY,
        AUG,
        SEP,
        OCT,
        NOV,
        DEC
    }
    
    public static void main(String[] args) {
        for (Months m : Months.values()) {
            System.out.println(m);
        }
    }
    
}

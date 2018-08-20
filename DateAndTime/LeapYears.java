/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateAndTime;
import java.util.*;
/**
 *
 * @author safev
 */
public class LeapYears {
    public static void main(String[] args) {
        GregorianCalendar cal = (GregorianCalendar) GregorianCalendar.getInstance();
        int year = 2018;
        boolean isLeapYear = cal.isLeapYear(year);
        if (isLeapYear) {
            System.out.println("Leap Year!");
        }else{
            System.out.println("Not Leap Year");
        }
    }
}

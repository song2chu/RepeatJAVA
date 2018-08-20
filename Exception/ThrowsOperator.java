/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

import java.io.*;

/**
 *
 * @author safev
 */
public class ThrowsOperator {

    public static void main(String[] args) {
        try {
            String filename = getName();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getName() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

}

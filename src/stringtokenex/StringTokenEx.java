/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringtokenex;

import java.util.StringTokenizer;

/**
 *
 * @author parinsu
 */
public class StringTokenEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String delims = ",";
        String splitString = "one,two,,three,four,,five";
        
        System.out.println("StringTokenizer Example: \n");
        StringTokenizer st = new StringTokenizer(splitString, delims);
        
        while(st.hasMoreTokens()){
            System.out.println("StringTokenizer Output: " + st.nextElement());
        }
        
        System.out.println("\n\nSplit Example: \n");
        String[] tokens = splitString.split(delims);
        int tokenCount = tokens.length;
        for(int j = 0; j < tokenCount; j++){
            System.out.println("Split Output: " + tokens[j]);
        }
    }
    
}

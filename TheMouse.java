/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package themouse;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author klinton
 */
public class TheMouse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int distance = 21;
     int stones = 20;
     
     Scanner step = new Scanner(System.in);
     System.out.print("Enter number of steps 1-3 : ");
        int steps = step.nextInt();
        System.out.println(steps);
        
        if(steps == 3){
          System.out.println("The mouse made 8 jumps");   
        }
        else if(steps == 2){
          System.out.println("The mouse made 11 jumps"); 
    }
        else if(steps == 1){
          System.out.println("The mouse made 21 jumps"); 
         
    }
        else{
           System.out.println("Enter a number less than 3");  
        }
    }
}
     
       
       
           
    
    


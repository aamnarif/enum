
package test;

import java.util.Scanner;

/**
 *
 * @author Student
 */

public class Test {

   
    public static void main(String[] args) {
    Scanner s= new Scanner(System.in);   
    String a;
        System.out.println("Enter a day:");
        a=s.nextLine();
       
        Names n1= new Names(Day.valueOf(a));
        n1.daysname();
        
    }
    
}

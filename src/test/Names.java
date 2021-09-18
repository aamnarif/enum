/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

enum Day{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY,FRIDAY, SATURDAY, SUNDAY
}
public class Names {
    Day day;

    public Names(Day day) {
        this.day = day;
    }

 
    public void daysname(){
    
   switch(day)
   {
       case MONDAY:
           System.out.println("MONDAYS ARE GREAT");
           break;
           
       case FRIDAY:
         System.out.println("FRIDAYS ARE FUN");
           break;
           
       case SATURDAY:
       case SUNDAY:
           System.out.println("WEEKENDS");
           break;
           
       default:
           System.out.println("other days");
   break;
   }
}
}
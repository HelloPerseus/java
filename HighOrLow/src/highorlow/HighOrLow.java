/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HighOrLow;

import java.util.Scanner;

/**
 *
 * @author Education Unlimited
 */
public class HighOrLow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int Secretnumber = (int) (Math.random()*99) +1;
         System.out.println("You will guess one number in 1 to 100, I will tell you if it is low or high. Good Luck!");
       int input = Integer.parseInt(keyboard.nextLine());
         while(input!=Secretnumber){
             if (input>Secretnumber){
                 System.out.println("Too high!");
             }
             else  {
                 System.out.println("Too Low!");
         }
             System.out.println("Try again! What is the number?");
             input = Integer.parseInt(keyboard.nextLine());
         }
         if (input==Secretnumber)   {
             System.out.println("Good Job!");
         }
         
         
    }
    
}

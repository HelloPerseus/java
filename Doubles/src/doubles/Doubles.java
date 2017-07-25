/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doubles;

import java.util.Scanner;

/**
 *
 * @author Education Unlimited
 */
public class Doubles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int dice = (int) (Math.random()*11) +1;
        System.out.println("I will rolls 2 dice,guess a number!");
        int guess = Integer.parseInt(keyboard.nextLine());
        if (guess==dice)    {
             System.out.print( "GJ " );
        }
        else    {
             System.out.print( "You suck! " );
        }
        }
    }
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hatshop;

import java.util.Scanner;

/**
 *
 * @author Education Unlimited
 */
public class HatShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        try {
            System.out.println("\tA)option 1: Add a hat to cart");
            Thread.sleep(1000);
            System.out.println("\tB)option 2: See your cart");
            Thread.sleep(1000);
            System.out.println("\tC)option 3: Remove hats from the order");
            Thread.sleep(1000);
            System.out.println("\tD)option 4: Check out");
            //option name
            String optiona = keyboard.nextLine();
            String optionb = keyboard.nextLine();
            String optionc = keyboard.nextLine();
            String optiond = keyboard.nextLine();
            //option a
            if (optiona.equals("A")) {

            } 
            //option b
            else if (optionb.equals("B")) {

            }
            //option c
            else if (optionc.equals("C")) {

            }
            //option d
            else if (optiond.equals("D")) {

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

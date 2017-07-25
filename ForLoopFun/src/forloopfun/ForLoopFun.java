/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forloopfun;

import java.util.Scanner;

/**
 *
 * @author Education Unlimited
 */
public class ForLoopFun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int o = 0; o < 10; o++) {
            System.out.println("I love Java.");
        }
        System.out.println("Enter a number. For example: 10, then I will COUNT TO 10.'");

        Scanner keyboard = new Scanner(System.in);
        int input = Integer.parseInt(keyboard.nextLine());
        int number = 1;
        for (int x = 0; x < input; x++) {
            System.out.println(x);
        }

        int[] array1 = new int[10];

        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        array1[3] = 4;
        array1[4] = 5;
        array1[5] = 6;
        array1[6] = 7;
        array1[7] = 8;
        array1[8] = 9;
        array1[9] = 10;

        int[] array2 = new int[10];
        for (int i = 0; i < 10; i++) {
            
            array2[i]=array1[i]+2;
            System.out.println(array2[i]);

        }

        int[] array3 = new int [100];
        for (int c = 0; c < 100; c++){
            array3[c] = c % 5;
            System.out.println(array3[c]);
           
        }
                }
}

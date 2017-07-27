/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chooseyourownadventure;

import java.util.Scanner;

/**
 *
 * @author Education Unlimited
 */
public class ChooseYourOwnAdventure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            System.out.println("Welcome to the Percy's Challenge. The only way to get out is answer the question.\n");
            System.out.println("The rule is: You will have two type of questions. Each of them will have 2 question. All anwsers correct and you will win!\n");
            System.out.println("Good luck, warriors");

            boolean won = false;
            while (!won) {
                //Room N#1   
                Scanner keyboard = new Scanner(System.in);
                int rightAnswers = 0;

                System.out.println("Here is 2 choice, choose one of them. Good Luck!");

                //Question type
                System.out.println("\tA.) First choice is: Geography!");;
                System.out.println("\tB.) Second choice is: Music!");
                String answer1 = keyboard.nextLine();

                //Geography
                if (answer1.equals("A")) {
                    System.out.println("You gonna be transfer to another room. Good Luck!");
                    //loading
                    Thread.sleep(2000);
                    System.out.println("System loading..........");
                    Thread.sleep(2000);
                    System.out.println("0%");
                    Thread.sleep(3500);
                    System.out.println("60%");
                    Thread.sleep(1000);
                    System.out.println("99%");
                    Thread.sleep(3000);
                    System.out.println("Thx for your patience.");

                    //GEOGRAPHY FIRST QUESTION
                    System.out.println("Your first question will be super easy.");
                    Thread.sleep(1000);
                    System.out.println("Question 1: Adele's song Hello got awards at the Grammy. Which year did this occur?");
                    System.out.println("\tA) 56th");
                    System.out.println("\tB) 57th");
                    System.out.println("\tC) 58th");
                    System.out.println("\tD) 59th");
                    String answerofhello = keyboard.nextLine();
                    if (answerofhello.equals("D")) {
                        System.out.println("That is correct!");
                        System.out.println("Move to next one!");
                    //The last question
                    Thread.sleep(1000);
                    System.out.println("The last question!");
                    System.out.println("Question 2: In the song Thingking out Loud from Ed Sheeran. Which sentence is NOT in his lyrics?");
                    System.out.println("\tA) People fall in love in mysterious ways.");
                    System.out.println("\tB) Loving can hurt, loving can hurt sometimes");
                    System.out.println("\tC) When my hairs all but gone and my memory fades ");
                    System.out.println("\tD) Kiss me under the light of a thousand stars `"); 
                    String answeredsherran = keyboard.nextLine();
                     if (answeredsherran.equals("B")) {
                        System.out.println("GJ, You are win!");
                        Thread.sleep(1000);
                        System.out.println("You are super smart!");
                        Thread.sleep(1000);
                        System.out.println("You earn a starbucks for yourself!");
                        won = true;
                    }
                     else{
                         Thread.sleep(1000);
                          System.out.println("You are almost there! But not yet~~");
                          Thread.sleep(1000);
                     }
                    }
                    //go back home, trasher
                    else {
                        System.out.println("You need go back and do it again.");
                        Thread.sleep(1000);
                    }
                    
                    //MSUSIC
                } else {
                    System.out.println("You gonna be transfer to another room. Good Luck!");
                    System.out.println("System loading..........");
                    Thread.sleep(2000);
                    System.out.println("0%");
                    Thread.sleep(3500);
                    System.out.println("60%");
                    Thread.sleep(1000);
                    System.out.println("99%");
                    Thread.sleep(3000);
                    System.out.println("Thx for your patience.");
                    
                    //Music First question
                    System.out.println("Your first question will be super easy.");
                    Thread.sleep(1000);
                    System.out.println("Question 1: How big is the territory of U.S.?");
                    System.out.println("\tA)  8,608 mi²");
                    System.out.println("\tB)  7,608 mi²");
                    System.out.println("\tC)  8,508 mi²");
                    System.out.println("\tD)  7,608 mi²");
                    String answerUSarea = keyboard.nextLine();
                    if (answerUSarea.equals("A")) {
                        System.out.println("That is correct!");
                        System.out.println("Move to next one!");
                        //last question
                         Thread.sleep(1000);
                    System.out.println("The last question!");
                    System.out.println("Question 2: What is the biggest state of U.S.?");
                    System.out.println("\tA) California");
                    System.out.println("\tB) New York");
                    System.out.println("\tC) Alaska");
                    System.out.println("\tD) Texas"); 
                    String answerstate = keyboard.nextLine();
                     if (answerstate.equals("C")) {
                        System.out.println("GJ, You are win!");
                        Thread.sleep(1000);
                        System.out.println("You are super smart!");
                        Thread.sleep(1000);
                        System.out.println("You earn a starbucks for yourself!");
                        won = true;
                    }
                     else{
                         Thread.sleep(1000);
                          System.out.println("You are almost there! But not yet~~~~");
                          Thread.sleep(1000);
                     }
                    }
                    else {
                        System.out.println("You need go back and do it again.");
                        Thread.sleep(1000);
                    }
                    
                    
                }

            }
            
            
            
            
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}


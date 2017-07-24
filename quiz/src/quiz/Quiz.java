package quiz;

import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int rightAnswers = 0;
        
        System.out.println("Here comes a quiz. No cheating!");
        
        System.out.println("Question 1: What is the capital of California?");
        System.out.println("\tA) San Francisco");
        System.out.println("\tB) Sacramento");
        System.out.println("\tC) Los Angeles");
        System.out.println("\tD) San Jose");
        String answer1 = keyboard.nextLine();
        if (answer1.equals("B")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the captital is actually Sacramento!");
        }
        
               
        System.out.println("Question 2: What is the capital of China?");
        System.out.println("\tA) Beijing");
        System.out.println("\tB) Shanghai");
        System.out.println("\tC) Los Angeles");
        System.out.println("\tD) Xianggang");
        String answer2 = keyboard.nextLine();
        if (answer2.equals("A")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the captital is actually Sacramento!");
        }
        
                System.out.println("Here comes a quiz. No cheating!");
        
        System.out.println("Question 3: How are you today?");
        System.out.println("\tA) Good");
        System.out.println("\tB) No");
        System.out.println("\tC) I wanna kill myself");
        System.out.println("\tD) I dont know");
        String answer3 = keyboard.nextLine();
        if (answer3.equals("C")) {
            System.out.println("That is correct! Quiz always terrible!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, we dont want good student!");
        }
        
                System.out.println("Here comes a quiz. No cheating!");
        
        System.out.println("Question 4: 1+1=?");
        System.out.println("\tA) 2");
        System.out.println("\tB) two");
        System.out.println("\tC) 11");
        System.out.println("\tD)i dont know");
        String answer4 = keyboard.nextLine();
        if (answer4.equals("C")) {
            System.out.println("GJ!");
            rightAnswers++;
        }
        else {
            System.out.println("You suck!");
        }
        
                System.out.println("Here comes a quiz. No cheating!");
        
        System.out.println("Question 5: Do you like play League of Legends?");
        System.out.println("\tA) Noo");
        System.out.println("\tB) Yes");
        String answer5 = keyboard.nextLine();
        if (answer5.equals("B")) {
            System.out.println("Go home and play it!");
            rightAnswers++;
        }
        else {
            System.out.println("You such a nerds");
        }
        
        System.out.println("Your score is " + rightAnswers + " out of 5 question.");
    }
    
}
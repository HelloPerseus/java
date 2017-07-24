package userdata;

import java.util.Scanner;
public class UserData {

    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println( "What is your name?" );
        String name = keyboard.nextLine();
        System.out.println("Hi, " + (name) + "! How old are you?");
        int age = Integer.parseInt(keyboard.nextLine());
        System.out.println("When is you birthday year?");
        int year = Integer.parseInt(keyboard.nextLine());
        System.out.println("When is your birthday month?");
        String month = keyboard.nextLine();
        System.out.println("When is you birthday day?");
        int day = Integer.parseInt(keyboard.nextLine());
        System.out.println("What is your favorite book?");
        String bookname = keyboard.nextLine();
        System.out.println("Where are you from?");
        String townname = keyboard.nextLine();
        System.out.println("What is your lucky number?");
        double luckynumber = Double.parseDouble(keyboard.nextLine());
        System.out.println("What is your shoe size?");
        double shoesize = Double.parseDouble(keyboard.nextLine());
        System.out.println("On a scale of 1 to 5, how excited are you to learn Java?");
        double number = Double.parseDouble(keyboard.nextLine());
        System.out.println("Tell me something cool about yourself.");
        String fact = keyboard.nextLine();
        System.out.println(name + ", age " + age + ", was born on " + month + " " + day + ", " + year + ". From " + townname + ", "+name+" has lucky number " + luckynumber+" and a shoe size of" + shoesize + ". On a scale of 1 to 5, " + name +" is the excited to learn of Java: " + number + "! A fun fact about " + name +" is: " + fact +"!");
        age += 5;
        boolean a1 = (2017-year)==(age);
        boolean a2 = (year/2000)>=1;
        double sxenumber = shoesize * number;
        System.out.println("This is your age in 5 years from now "  + (age += 5));
        System.out.println("Your age is "+a1);
        System.out.println("You are born after 2000, it is " + a2);
        System.out.println("Your shoe size times your excitement level is " + sxenumber);
        
    }
    
}
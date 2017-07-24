package repeater;

import java.util.Scanner;

public class Repeater {

    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       System.out.print( "Type something, and I will repeat it." );
       String input = keyboard.nextLine();
       System.out.print( "How many times you want me to repeated? " );
       int times = Integer.parseInt(keyboard.nextLine());
       
       System.out.println("Here we go!");
       int count = 0;
       int number = 1;
       while (count < times) {
           System.out.println(number + "." + input);
           number ++;
           count ++;
       }
    }
    
}

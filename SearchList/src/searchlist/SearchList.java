/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchlist;
import java.util.ArrayList;
import java.util.Scanner;
public class SearchList{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList();
            al.add(1);
            al.add(2);
            al.add(3);
            al.add(4);
            al.add(5);
            al.add(6);
            al.add(7);
            al.add(8);
            al.add(9);
            al.add(10);
            System.out.println(al);
            System.out.println("What number would you like to search for?");
            int a = Integer.parseInt(keyboard.nextLine());
            boolean found = false;
            if (al.contains(a))  {
                System.out.println("Your number is in the array.");
            }
            else    {
                System.out.println("Your number is not in the array.");
            }
            boolean thing = false;
            int max = 0;
            for (int b:al) {
                if ( b > max) {
                    max = b;
                }
            }
            System.out.println(max + " is the biggest number on your list.");
            
            
            
            ArrayList<String> a2 = new ArrayList();
            
            s.a2.add("A");
            s.a2.add("bunch");
            s.a2.add("of");
            s.a2.add("revolutionary");
            s.a2.add("manumission");
            s.a2.add("abolitionists");
            s.a2.add("give");
            s.a2.add("me");
            s.a2.add("your");
            s.a2.add("postion");
            s.a2.add("show");
            s.a2.add("me");
            s.a2.add("where");
            s.a2.add("the");
            s.a2.add("ammunition");
            s.a2.add("is");
            
            if( .comparaTo(a2)>2)   {
        S
    }
    }
}

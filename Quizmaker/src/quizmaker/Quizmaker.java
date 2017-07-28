/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizmaker;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Education Unlimited
 */
public class Quizmaker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Your gonna do 10 questions, type number 1 or 2 for each question. Good Luck!");
        ArrayList<Question> questions = new ArrayList();
        Scanner keyboard = new Scanner(System.in);
        //read in questions
        try (BufferedReader reader = new BufferedReader(new FileReader("test.txt"))) {

            String currentLine = reader.readLine();
            String q = "";
            ArrayList<String> a = new ArrayList();
            String c = "";
            while (currentLine != null) {
                if (currentLine.contains("q")) {
                    currentLine = reader.readLine();
                    q = currentLine;
                    currentLine = reader.readLine();
                } else if (currentLine.contains("a")) {
                    currentLine = reader.readLine();
                    while (!currentLine.contains("c")) {
                        a.add(currentLine);
                        currentLine = reader.readLine();
                    }
                } else if (currentLine.contains("c")) {
                    currentLine = reader.readLine();
                    c = currentLine;
                    currentLine = reader.readLine();
                } else {
                    currentLine = reader.readLine();
                    Question question = new Question(q, a, c);
                   
                    questions.add(question);
                    a = new ArrayList();
                }
                

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
        int rightnumber = 0;
        int n=1;
        while (n<=10) {
            int random = (int) (Math.random() * questions.size());
            Question q =questions.get(random);
            q.printQuestion();
            String correct = q.getCorrect();
            questions.remove(q);
            n++;
            String input = keyboard.nextLine();
            if (input.equals(correct)) {
                rightnumber++;
            }
        }
        System.out.println("You got "+rightnumber+" out of 10 correct");

    }

}

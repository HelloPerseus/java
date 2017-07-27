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

/**
 *
 * @author Education Unlimited
 */
public class Quizmaker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Question> questions= new ArrayList();
        //read in questions
         try (BufferedReader reader = new BufferedReader(new FileReader("test.txt"))) {

            String currentLine = reader.readLine();
            String q="";
            ArrayList<String> a =new ArrayList();
            String c ="";
            while (currentLine != null) {
                if (currentLine.equals("q")) {
                    currentLine = reader.readLine();
                    q = currentLine;
                }
                else if (currentLine.equals("a")){
                    currentLine=reader.readLine();
                    while(!currentLine.equals("c")) {
                        a.add(currentLine);
                        currentLine=reader.readLine();
                    }
                }
                else if (currentLine.equals("c")) {
                    
                    c =currentLine;
                }
                else {
                    currentLine=reader.readLine();
                    Question question = new Question(q, a, c);
                questions.add(question);
                a= new ArrayList();
                }
            currentLine=reader.readLine();
          
            }
       
	}
        catch (IOException e) {
            e.printStackTrace();
	}
         
         int random =1;
         questions.get(random).printQuestion();
         String correct = questions.get(random).getCorrect();
        
         
    }
    
}

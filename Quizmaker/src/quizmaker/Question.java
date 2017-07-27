/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizmaker;

import java.util.ArrayList;

/**
 *
 * @author Education Unlimited
 */
public class Question {

    public String getQuestion() {
        return question;
    }   

    public void setQuestion(String question) {
        this.question = question;
    }

    public ArrayList<String> getAnswers() {
        return answer;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answer = answers;
    }

    public String getCorrect() {
        return correct;
    }

    public void setCorrect(String correct) {
        this.correct = correct;
    }
    
    String question;
    ArrayList<String> answer;
    String correct;
    
    public Question(String newquestion, ArrayList<String> newanswer, String newcorrect)     {
        question = newquestion;
        answer = newanswer;
        correct = newcorrect;
        
        
    }
    
    public void printQuestion() {
        System.out.println(question);
        for (String a : answer) {
            System.out.println(a);
        }
    }
}
    
    

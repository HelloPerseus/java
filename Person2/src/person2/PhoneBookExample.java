/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person2;

/**
 *
 * @author Education Unlimited
 */
public class PhoneBookExample {
    public static void main(String[] args) {
    Person2 P1 = new Person2 ("Percy", "Wang", "911");
    Person2 P2 = new Person2 ("Harry", "Potter", "110");
    Person2 P3 = new Person2 ("Obama", "goodboy", "1213");
    Person2 P4 = new Person2 ("MC", "Trump", "3121");
    Person2 P5 = new Person2 ("Superman", "Stanford", "4008123123");
    Person2 P6 = new Person2 ("Pizza", "Girl", "123456789");
    Person2 P7 = new Person2 ("Pizza", "Boy", "987654321");
    Person2 P8 = new Person2 ("Justin", "Trump", "2333333");
    Person2 P9 = new Person2 ("Japan", "Perisident", "250250250250");
    Person2 P10 = new Person2 ("Big", "Dog", "88888888");
    
    
    phonebook PB = new phonebook();
    
    PB.addPerson(P1);
    PB.addPerson(P2);
    PB.addPerson(P3);
    PB.addPerson(P4);
    PB.addPerson(P5);
    PB.addPerson(P6);
    PB.addPerson(P7);
    PB.addPerson(P8);
    PB.addPerson(P9);
    PB.addPerson(P10);
    
    
    PB.printEntries();
    
}}

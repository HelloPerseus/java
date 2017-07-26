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
public class phonebook {
    Person2[] PBlist;
    int size;
    
    public phonebook()  {
        size = 0;
        PBlist = new Person2[10];
       
    }
    
    public void addPerson(Person2 p)   {
        PBlist[size]=p;
        size++;
    }
    
    public void printEntries()  {
        for (int i= 0; i<size; i++)  {
        System.out.println(PBlist[i].getLastname() + ", " + PBlist[i].getFirstname() + " - Phone number" + PBlist[i].getPhonenumber());
    }
    }
        
    
}

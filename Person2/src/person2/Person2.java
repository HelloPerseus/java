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
public class Person2 {

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        this.Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        this.Lastname = lastname;
    }

    public String getPhonenumber() {
        return Phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.Phonenumber = phonenumber;
    }
    
    
    
        String Firstname;
        String Lastname;
        String Phonenumber;
        
        
        public Person2(String fn, String ln, String pn) {
            Firstname=fn;
            Lastname=ln;
            Phonenumber=pn;
        }
       
}      
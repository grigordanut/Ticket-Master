/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketmasterproject;

/**
 *
 * @author Grigor Danut and Antonio Penna
 */

    //declare variables(data members)
public class Register {
    protected String firstName;
    protected String lastName;
    protected String userName;
    protected String password;
    
    //constructor(assign the value to variables)   
    public Register(){
        firstName="";
        lastName="";
        userName="";
        password="";
    }
    
    //constructor
    public Register(String firstName, String lastName, String userName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
    }
    
    //getter and setter method
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSureName() {
        return lastName;
    }

    public void setSureName(String sureName) {
        this.lastName = sureName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    //add details to string from instantiable class
    @Override
    public String toString() {
        return "Register{" + "firstName=" + firstName + ", sureName=" + lastName + ", userName=" + userName + ", password=" + password + '}';
    }  
}

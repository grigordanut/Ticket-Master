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

//open a super class (parent class) Person
public abstract class Person {
    
    //data members
    protected String firstName;
    protected String sureName;
    protected String email;
    protected String phone;  
    protected String gender;
    protected String seatCategory;
    protected int numberTickets;     
    protected double starPrice;
    protected double premiumPrice;  
    protected double economyPrice;    
  
    //constructor    
    public Person(){
        firstName="";
        sureName="";
        email="";
        phone="";
        gender="";
        seatCategory="";
        numberTickets=0;
        starPrice=90.00;
        premiumPrice=80.00;
        economyPrice=70.00;         
    }
    
    //constructor
    public Person(String firstName, String sureName, String email, String phone, String gender, String seatCategory, int numberTickets, double starPrice, double premiumPrice, double economyPrice) {
        this.firstName = firstName;
        this.sureName = sureName;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.seatCategory = seatCategory;
        this.numberTickets = numberTickets;
        this.starPrice = starPrice;
        this.premiumPrice = premiumPrice;
        this.economyPrice = economyPrice;
    }
    
    //getter and setter method
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSeatCategory() {
        return seatCategory;
    }

    public void setSeatCategory(String seatCategory) {
        this.seatCategory = seatCategory;
    }

    public int getNumberTickets() {
        return numberTickets;
    }

    public void setNumberTickets(int numberTickets) {
        this.numberTickets = numberTickets;
    }

    public double getStarPrice() {
        return starPrice;
    }

    public void setStarPrice(double starPrice) {
        this.starPrice = starPrice;
    }

    public double getPremiumPrice() {
        return premiumPrice;
    }

    public void setPremiumPrice(double premiumPrice) {
        this.premiumPrice = premiumPrice;
    }

    public double getEconomyPrice() {
        return economyPrice;
    }

    public void setEconomyPrice(double economyPrice) {
        this.economyPrice = economyPrice;
    }
    
    //print details directly from instantiable class
    public String printDetails(){
        return "Person Details:\nThe First Name is: "+firstName+"\nThe Sure Name is: "+sureName+"\nThe Email is: "+email+"\nThe Phone Number is: "+phone+"\nThe Gender is: "+gender+"\nThe Seat Category is: "+seatCategory+"\nThe Number Tickets is: "+numberTickets;
    }
    
    //compute total cost from instantiable class
    public abstract void computeTotalCost();    
}

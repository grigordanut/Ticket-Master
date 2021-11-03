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

//open the subclass(child class) of Person class
public class Elder extends Person{
    
    //data members     
    private double starElderPrice;  
    private double premiumElderPrice;
    private double economyElderPrice;
    private final double ELDERDISCOUNT;
    private double totalCost;    
    
    //constructor
    public Elder(){  
        starElderPrice=0.00;
        premiumElderPrice=0.00; 
        economyElderPrice=0;
        ELDERDISCOUNT=0.95;
        totalCost=0.0;
    }

    //constructor
    public Elder(double starElderPrice, double premiumElderPrice, double economyElderPrice, double ELDERDISCOUNT, double totalCost, String firstName, String sureName, String email, String phone, String gender, String seatCategory, int numberTickets, double starPrice, double premiumPrice, double economyPrice) {
        super(firstName, sureName, email, phone, gender, seatCategory, numberTickets, starPrice, premiumPrice, economyPrice);
        this.starElderPrice = starElderPrice;
        this.premiumElderPrice = premiumElderPrice;
        this.economyElderPrice = economyElderPrice;
        this.ELDERDISCOUNT = ELDERDISCOUNT;
        this.totalCost = totalCost;
    }

    //getter and setter method
    public double getStarElderPrice() {
        return starElderPrice;
    }

    public void setStarElderPrice(double starElderPrice) {
        this.starElderPrice = starElderPrice;
    }

    public double getPremiumElderPrice() {
        return premiumElderPrice;
    }

    public void setPremiumElderPrice(double premiumElderPrice) {
        this.premiumElderPrice = premiumElderPrice;
    }

    public double getEconomyElderPrice() {
        return economyElderPrice;
    }

    public void setEconomyElderPrice(double economyElderPrice) {
        this.economyElderPrice = economyElderPrice;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }  
    
    //compute method to compute star premuim and economy prices
    public void computeStarElderPrice(){
        starElderPrice=starPrice*ELDERDISCOUNT;
    }
    
    public void computePremiumElderPrice(){
        premiumElderPrice=premiumPrice*ELDERDISCOUNT;
    }
    
    public void computeEconomyElderPrice(){
        economyElderPrice=economyPrice*ELDERDISCOUNT;
    }
    
    //compute total cost from super class
    @Override
    public void computeTotalCost(){
        totalCost=numberTickets*(starElderPrice+premiumElderPrice+economyElderPrice);
    }      
    
    //print total cost from Elder class
    @Override
    public String printDetails(){
        return super.printDetails()+"\nThe Total Cost is: € "+totalCost;        
    }
}

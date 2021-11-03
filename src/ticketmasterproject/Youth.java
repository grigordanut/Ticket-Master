/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketmasterproject;

/**
 *
 * @author danut
 */
//open the subclass(child class) of Person class
public class Youth extends Person{
    //data members        
    private double starYouthPrice;  
    private double premiumYouthPrice;
    private double economyYouthPrice;
    private final double YOUTHDISCOUNT;
    private double totalCost;
    
    //constructor
    public Youth(){ 
        starYouthPrice=0.00;
        premiumYouthPrice=0.00; 
        economyYouthPrice=0;
        YOUTHDISCOUNT=0.9;
        totalCost=0.0;
    }

    //constructor
    public Youth(double starYouthPrice, double premiumYouthPrice, double economyYouthPrice, double YOUTHDISCOUNT, double totalCost, String firstName, String sureName, String email, String phone, String gender, String seatCategory, int numberTickets, double starPrice, double premiumPrice, double economyPrice) {
        super(firstName, sureName, email, phone, gender, seatCategory, numberTickets, starPrice, premiumPrice, economyPrice);
        this.starYouthPrice = starYouthPrice;
        this.premiumYouthPrice = premiumYouthPrice;
        this.economyYouthPrice = economyYouthPrice;
        this.YOUTHDISCOUNT = YOUTHDISCOUNT;
        this.totalCost = totalCost;
    }

    //getter and setter method
    public double getStarYouthPrice() {
        return starYouthPrice;
    }

    public void setStarYouthPrice(double starYouthPrice) {
        this.starYouthPrice = starYouthPrice;
    }

    public double getPremiumYouthPrice() {
        return premiumYouthPrice;
    }

    public void setPremiumYouthPrice(double premiumYouthPrice) {
        this.premiumYouthPrice = premiumYouthPrice;
    }

    public double getEconomyYouthPrice() {
        return economyYouthPrice;
    }

    public void setEconomyYouthPrice(double economyYouthPrice) {
        this.economyYouthPrice = economyYouthPrice;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
    
    //compute method to compute star premuim and economy prices
    public void computeStarYouthPrice(){
        starYouthPrice=starPrice*YOUTHDISCOUNT;
    }
    
    public void computePremiumYouthPrice(){
        premiumYouthPrice=premiumPrice*YOUTHDISCOUNT;
    }
    
    public void computeEconomyYouthPrice(){
        economyYouthPrice=economyPrice*YOUTHDISCOUNT;
    }
    
    //compute total cost from super class
    @Override
    public void computeTotalCost(){
        totalCost=numberTickets*(starYouthPrice+premiumYouthPrice+economyYouthPrice);
    }   
    
    //print total cost from Elder class
    @Override
    public String printDetails(){
        return super.printDetails()+"\nThe Total Cost is: € "+totalCost;        
    }
}

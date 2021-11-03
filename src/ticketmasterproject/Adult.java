/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketmasterproject;

/**
 *
 * @author Grigor Danut and Antionio Penna
 */
//open the subclass(child class) of Person class
public class Adult extends Person{
    
    //data members     
    private double starAdultPrice;  
    private double premiumAdultPrice;
    private double economyAdultPrice;    
    private double totalCost;
    
    //constructor    
    public Adult(){  
        starAdultPrice=0.00;
        premiumAdultPrice=0.00;
        economyAdultPrice=0.00;          
        totalCost=0.0;
    }
    
    //constructor
    public Adult(double starAdultPrice, double premiumAdultPrice, double economyAdultPrice, double totalCost, String firstName, String sureName, String email, String phone, String gender, String seatCategory, int numberTickets, double starPrice, double premiumPrice, double economyPrice) {
        super(firstName, sureName, email, phone, gender, seatCategory, numberTickets, starPrice, premiumPrice, economyPrice);
        this.starAdultPrice = starAdultPrice;
        this.premiumAdultPrice = premiumAdultPrice;
        this.economyAdultPrice = economyAdultPrice;
        this.totalCost = totalCost;
    }
    
    //getter and setter method
    public double getStarAdultPrice() {
        return starAdultPrice;
    }

    public void setStarAdultPrice(double starAdultPrice) {
        this.starAdultPrice = starAdultPrice;
    }

    public double getPremiumAdultPrice() {
        return premiumAdultPrice;
    }

    public void setPremiumAdultPrice(double premiumAdultPrice) {
        this.premiumAdultPrice = premiumAdultPrice;
    }

    public double getEconomyAdultPrice() {
        return economyAdultPrice;
    }

    public void setEconomyAdultPrice(double economyAdultPrice) {
        this.economyAdultPrice = economyAdultPrice;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }    
    
    //compute method to compute star, premuim and economy price
    public void computeStarAdultPrice(){
        starAdultPrice=starPrice;
    }    
    
    public void computePremiumAdultPrice(){
        premiumAdultPrice=premiumPrice;
    }    
    
    public void computeEconomyAdultPrice(){
        economyAdultPrice=economyPrice;
    }   
    
    //compute total cost 
    @Override
    public void computeTotalCost(){
        totalCost=numberTickets*(starAdultPrice+premiumAdultPrice+economyAdultPrice);
    }       
    
    //print total cost from Adult class
    @Override
    public String printDetails(){
        return super.printDetails()+"\nThe Total Cost is: € "+totalCost;        
    }
}

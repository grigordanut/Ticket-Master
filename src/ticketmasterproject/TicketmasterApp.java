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

//open an App class
public class TicketmasterApp {

    /**
     * @param args the command line arguments
     */  
    
    public static void main(String[] args) {
        // TODO code application logic here      
        
        //declare object ticket of the class TicketmasterGUI
        TicketmasterGUI ticket = new TicketmasterGUI();
        
        //set the GUI farme visible
        ticket.setVisible(true);
    }   
}

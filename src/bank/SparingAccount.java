/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

import java.util.ArrayList;

/**
 *
 * @author angelo
 */
public class SparingAccount extends Account{
    
    public double calculInterest(){
       return this.solde-=(this.solde*this.interest);
   } 
    
   public SparingAccount(String owner,String number,double solde,double interest){
       this.loanList = new ArrayList<Loan>();
       this.owner=owner;
       this.interest=interest;
       this.number=number;
       this.solde=solde;
   }
}

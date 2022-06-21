/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

import static java.lang.System.in;
import java.util.ArrayList;

/**
 *
 * @author angelo
 */
public abstract class  Account {
    
    protected String owner;
    protected String number;
    protected double solde;
    protected double interest;
    protected ArrayList<Loan> loanList;
    
    
    
    public ArrayList<Loan> getLoan(){
        return loanList;
    } 
    

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner(){
        return this.owner;
    }

    public double getSolde() {
        return solde;
    }

    public double getInterest() {
        return interest;
    }

    public String getNumber() {
        return number;
    }
    
    public double deposit(double montant){
        if(montant<0){
            return this.solde;
        }else{
            this.solde+=montant;
            return this.solde;
        }
    }

    public double withdraw(double montant){
        if (montant<=0 || montant>this.solde){
           return this.solde;
        }else{
            this.solde-=montant;
            return this.solde;
        }
    }
    
    abstract double calculInterest(); 
    
    public void isRembursed(double montant){
        if(montant>0){
            this.solde+= montant;
        }
    }
    
    public void addLoan(Loan loan){
        this.loanList.add(loan);
    }
    
    public void payYourLoans(){
        for(Loan loan : this.loanList){
            loan.rembourse();
        }
    }
}

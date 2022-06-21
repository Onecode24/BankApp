
package bank;

public class Loan {
    
    private double amount;
    private double mensuality;
    
    public Loan(double amount,double mensuality,Account account){
        this.amount=amount;
        this.mensuality=mensuality;
    }
    
    public void setAmount(double amount){
        this.amount=amount;
    }
    
    public void setMensuality(double mensuality){
        this.mensuality=mensuality;
    }
    
    public double getAmount(){
        return this.amount;
    }
    
    public double getMensuality(){
        return this.mensuality;
    }
    
    public void rembourse(){
        this.amount-=this.mensuality;
        if(this.amount<0) this.amount=0;
    }
    
}

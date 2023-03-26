/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week01;
import java.util.Date;
/**
 *
 * @author user
 */
public class Account {
    
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate  = 0;
    private Date dateCreated ;

    public Account() { // contructor with no parameter
    }

    public Account(int id, double balance, double annualInterestRate) {
        // constructor with three data of parameter
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() { // accessor
        return id;
    }

    public void setId(int id) { // mutator
        this.id = id;
    }

    public double getBalance() { // accessor
        return balance;
    }

    public void setBalance(double balance) { // mutator
        this.balance = balance;
    }

    public double getAnnualInterestRate() { // accessor
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) { // mutator
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    
    public double getMonthlyInterestrate(){ // method that return monthly interest rate
        return annualInterestRate / 12 ;
    }
    
    public double getMonthlyInterest(){ // method that calculate and return mothly interest
        return (getMonthlyInterestrate()) * this.balance;
    }
    
    public boolean withdraw (int amount){ // method to withdraw based on amount specified
        double money = balance - amount ;
        if(money>0){
            balance-= amount ;
            return true;
        }
        else
            return false;
    }
    
    public double deposit(int amount){ // method to deposit into the account
        balance+= amount;
        return balance;
    }
}

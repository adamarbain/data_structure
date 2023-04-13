/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;
import java.util.Date;
/**
 *
 * @author user
 */
public class Transaction {
    // creatiing a constant value of char datatype 
    public static char withdrawal = 'W';
    public static char deposit = 'D';
    
    private Date date;
    private char type ;
    private double amount ;
    private double balance ;
    private String description ; // String consistst of description of the transaction

    // constructor named 'Transaction' consisits of many parameters
    public Transaction(char type, double amount, double balance, String description) {
        this.date = new Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    // creating accessor and mutator for each of the insatnce variable datatypes
    public static char getWithdrawal() {
        return withdrawal;
    }

    public static void setWithdrawal(char withdrawal) {
        Transaction.withdrawal = withdrawal;
    }

    public static char getDeposit() {
        return deposit;
    }

    public static void setDeposit(char deposit) {
        Transaction.deposit = deposit;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    // method to display all instance variable intialised at the beginning of the code
    public void printDetails() {
        System.out.println("Date: " + this.getDate());
        System.out.println("Type: " + this.getType());
        System.out.println("Amount: " + this.getAmount());
        System.out.println("Balance: " + this.getBalance());
        System.out.println("Description: " + this.getDescription());
        System.out.println();
	}
    public void printdate(){
        System.out.println("Date Created : " +this.getDate());
    }
    
    
}

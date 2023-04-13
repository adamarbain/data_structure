/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author user
 */
public class Account1 extends Account { // superclass extends subclass
    
    private String name ;
    private ArrayList<Transaction> transaction ; // ArrayList dataType variable initialisation 
    private Date date;


    public Account1(int id, double balance, double annualInterestRate,String name) { // constructor consists of many parameter
        super(id, balance, annualInterestRate); // inherit some variable from superclass
        this.name = name ;
        this.transaction = new ArrayList<>() ;
        
    }

    public String getName() { // getter
        return name;
    }

    public void setName(String name) { // setter
        this.name = name;
    }

    public ArrayList<Transaction> getTransaction() {
        return transaction;
    }

    public void setTransaction(ArrayList<Transaction> transaction) {
        this.transaction = transaction;
    }

    public boolean withdraw (int amount,String description){ //advanced method to include transaction type and its description
        if( amount < this.getBalance()){
            super.withdraw(amount);
            transaction.add(new Transaction(Transaction.withdrawal,amount,this.getBalance(), description)); // adding some new elements into ArrayList Transaction
            return true;
        }
        return false;
    }
    
    public void deposit (int amount, String description){ //advanced method to include transaction type and its description
        super.deposit(amount);
        transaction.add(new Transaction(Transaction.deposit,amount,this.getBalance(),description)); // adding some new elements into ArrayList Transaction
    }
    
    public void printTransactionHistory() { // method created to print Transaction ArrayList based on printDetails method
		System.out.println("Transactions:");
		for(Transaction transaction : transaction) { // for loop to access each element in ArrayList Transaction
			transaction.printDetails();
		}
	}

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    public void printingDate (){
        System.out.println(this.getDate());
    }
}

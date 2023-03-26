/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week01;

/**
 *
 * @author user
 */
public class BankAccount {
    private int balance;//instance variable named balance

    // onstructor that accepts an integer that is used to initialize the instance variable
    public BankAccount(int startbal) {
        this.balance = startbal;
    }
    // deposit method that adds its parameter to the balance variable
    public int deposit (int amt){
        balance += amt ;
        return balance ;
    }
    // withdraw method that checks whether its parameter is less than or equal
    public boolean withdraw(int amt){
        if (amt <= balance){
            balance -= amt ;
            return true ;
        }
        else{
            return false;
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

/**
 *
 * @author user
 */
public class L1Q4 {
    
    public static void main(String[] args) {
        Account1 obj = new Account1(1122,1000,1.5,"George");
        obj.deposit(30, "1st deposit");
        obj.deposit(40, "2nd deposit");
        obj.deposit(50, "3rd deposit");
        obj.withdraw(5, "1st withdraw");
        obj.withdraw(4, "2nd withdraw");
        obj.withdraw(2, "3rd withdraw");
        
        System.out.println("Account holder name : " + obj.getName());
        System.out.println("Interest rate : " + obj.getMonthlyInterestrate());
        System.out.println("Balance : $ " + obj.getBalance());
        obj.printingDate();
        System.out.println("");
        
        obj.printTransactionHistory();
    }
}

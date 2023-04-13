/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

/**
 *
 * @author user
 */
public class L1Q3 {
    
    public static void main(String[] args) {
        Account obj = new Account (1122,20000,4.5);
        System.out.println("Before withdrawal and deposit :-");
        System.out.println("Balance : $ " +obj.getBalance());
        System.out.println("Monthly interest : $ "+obj.getMonthlyInterest());
        System.out.println("Date created : " +obj.getDateCreated());
        
        obj.withdraw(2500); // withdraw 2500 from balance
        obj.deposit(3000); // deposit 3000 into the account
        
        System.out.println("\nAfter withdrawal and deposit :- ");
        System.out.println("Balance : $ " +obj.getBalance());
        System.out.println("Monthly interest : $ "+obj.getMonthlyInterest());
        System.out.println("Date created : " +obj.getDateCreated());
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week01;

/**
 *
 * @author user
 */
public class T1Q2 {
    
    class Person{
        public Person(){
            System.out.println("(1) Performs Person's tasks");
        }
    }
    
    class Employee extends Person{
        public Employee(){
            this("(2) Invoke Employee's overloaded constructor");
            System.out.println("(3) Performs Employee's tasks");
        }
        public Employee(String s){
            System.out.println(s);
        }
    }
        class Faculty extends Employee {
            public Faculty(){
                System.out.println("(4) Perfroms Faculty's tasks ");
            }
        }
        
        public static void main(String[] args) {
                //new Faculty();
            }

        /*
        The output is:
        (1) Performs Person's tasks
        (2) Invoke Employee's overloaded constructor
        (3) Performs Employee's tasks
        (4) Performs Faculty's tasks

        The 'main()' method is called, creating a new 'Faculty' object.
        The 'Faculty' constructor is then called which also calls the 'Employee' constructor.
        The 'Employee' constructor is with the String parameter is called, which then prints the '(2) Invoke Employee's overloaded constructor'.
        The 'Employee' constructor then calls the 'Person' constructors, printing '(1) Performs Person's tasks'.\
        After that, the 'Employee' constructor proceeds to print '3) Performs Employee's tasks'.
        Finally, the 'Faculty' constructor prints '(4) Performs Faculty's tasks'.
        */

}

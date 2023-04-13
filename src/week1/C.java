/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

/**
 *
 * @author user
 */
public class C {
    public static void main(String[] args) {
        Object [] o = {new A(), new B()};
        System.out.print(o[0]);
        System.out.println(o[1]);
    }
}
class A extends B {
    public String toString(){
        return "A";
    }
}

class B {
    public String toString(){
        return "B";
    }
}
/*
a. AB
In the 'main()' class, array 'Object' is created and initialized with an instance of class 'A' and 'B'.
Both 'toString' method is overridden in both classes 'A' and 'B'.
When the 'toString' method is called on 'o[0]', it returns A, while 'o[1]' returns 'B'.

b. BA
Same as above, the only difference is the placement of which 'toString' method gets called first.
For this instance, 'o[1]' gets called first before 'o[0]', which returns 'B', then 'A'.
  
c. AA
Both 'toString' methods are called on 'o[0]', which returns both outputs as 'A'.

d. BB
Both 'toString' methods are called on 'o[1]', which returns both outputs as 'B'.
*/
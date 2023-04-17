package week5;


import java.util.Scanner;
public class TestLab2 {
    
    public static void main(String[] args) {
        System.out.println("Enter your student name list. Enter 'n' to end ....");
        KindergartenLinkedList<String> list = new KindergartenLinkedList<>();
        String name = " ";
        Scanner sc = new Scanner(System.in);
        
        while(!name.equals("n")){
            name = sc.nextLine();
            if(!name.equals("n")){
                list.add(name);
            }
        }

        System.out.println("\nYou have entered the following students name:");
        list.printList();

        System.out.println("\nThe number of students entered is: " + list.getSize());

        renameStudent(list);
        removeStudent(list);
        sc.close();
        System.out.println("\nAll student data captured completed. Thank you!");
    }

    public static void endProcess(KindergartenLinkedList<String> list) {
        System.out.println("\nThe number of updated students is: " + list.getSize());
        System.out.println("The updated list of students is:");
        list.printList();
        
    }

    public static void renameStudent(KindergartenLinkedList<String> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nAll the names entered are correct ? Enter 'r' to rename student name, 'n' to proceed");
        String choice = sc.nextLine();
        if(choice.equals("r")){
            System.out.println("\nEnter the name of the student to be rename");
            String oldName = sc.nextLine();
            System.out.println("\nEnter the new name ");
            String newName = sc.nextLine();
            list.removeElement(oldName);
            list.add(newName);
            System.out.println("\nThe new list of students is:");
            list.printList();
        
        }else if(choice.equals("n")){
            endProcess(list);
            sc.close(); 
        }
    }

    public static void removeStudent(KindergartenLinkedList<String> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nDo you want to remove any student ? Enter 'y' to remove student name, 'n' to proceed");
        String ch = sc.nextLine();
        if(ch.equals("y")){
            System.out.println("\nEnter the name of the student to be removed");
            String oldName = sc.nextLine();
            list.removeElement(oldName);
            endProcess(list);
        }else if(ch.equals("n")){
            endProcess(list);
            sc.close();
        }
    }

}

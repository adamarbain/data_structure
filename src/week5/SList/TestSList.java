package week5.SList;

public class TestSList {
    
    public static void main(String[] args) {
        
        SList<String> list = new SList<>();
        //(a) Add the following elements to the list: “Linked list, is, easy.
        list.appendEnd("Linked list,");
        list.appendEnd("is,");
        list.appendEnd("easy.");

        //(b) display these values
        list.display();

        // (c) remove the word "Linked list" and display the removed value
        System.out.println("Removed value: "+list.removeInitial());

        // (d) check if "difficult" is in the list
        System.out.println("Is \"difficult\" in the list? " + list.contains("difficult"));

        // (e) clear the list
        list.clear();
    }
}

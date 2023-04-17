package week4;

public class TestLinkedList {
    
    public static void main(String[] args) {

        MyLinkedList<Character> object = new MyLinkedList<>();
        //a
        object.addLast('a');
        object.addLast('b');
        object.addLast('c');
        object.addLast('d');
        object.addLast('e');

        //b
        object.print();

        //c
        object.reverse();

        //d
        System.out.println("Number of elements : " + object.getSize());

        //e
        System.out.println("First value: " + object.getFirst());
        System.out.println("Last value: " + object.getLast());

        //f
        System.out.println("Third value removed: "+object.remove(2));
        object.print();

        //g
        System.out.println("2nd value: "+object.get(2)+ " 3rd value: " + object.get(3));

        //h
        System.out.println("The list contains 'c' : "+object.contains('c'));

        //i
        char [] java = "java".toCharArray();

        for(int i = 0 ; i<object.getSize() ; i++)
            object.set(java[i], i);
            object.print();
           
        
    }

}

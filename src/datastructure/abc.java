package datastructure;

public class abc {

    public static void main(String[] args) {
        
        // print five different and random characters
        for (int i = 0; i < 5; i++) {
            System.out.print((char)('a' + Math.random() * ('z' - 'a' + 1)));
        }
        System.out.println();
}

}
package week12LabTest.Q2;

import java.util.Stack;
public class KingCrimson {
    public static String getActions(String[] initialOrder, String[] finalOrder) {
        final Stack<String> stack = new Stack<>();
    
        int i = 0;
        int j = 0;
        String actions = "";
        while (i < initialOrder.length) {
            if (initialOrder[i].equals(finalOrder[j])) {
                i++;
                j++;
                actions += i + " Diavalo instructs " +initialOrder[i-1]+ " to enter the college." + "\n"; // pop
            } else if (!stack.isEmpty() && stack.peek().equals(finalOrder[j])) {
                stack.pop();
                j++;
                actions += (i+1) + " Diavalo instructs "  +finalOrder[j-1] + " to enter the college."+"\n"; // exit the stack
            } else {
                stack.push(initialOrder[i]);
                i++;
                actions += i + " Diavalo instructs " +initialOrder[i-1]+ " to stay in the foyer." + "\n"; // pop
            }
        }
        while (!stack.isEmpty()) {
            if (stack.peek().equals(finalOrder[j])) {
                stack.pop();
                j++;
                actions += (i+1) + " Diavalo instructs "  +finalOrder[j-1] + " to enter the college."+"\n"; // exit the stack
            } else {
                return "KING CRIMSON!!!\n";
            }
        }
        return actions;


    }
        public static void main(String[] args) {
        final int N = 8;
        final String[][] initialOrderArray = {
                {"Hermit Purple", "Hierophant Green", "Magician Red","Silver Chariot", "Star Platinum"},
                {"Hermit Purple", "Hierophant Green", "Magician Red","Silver Chariot", "Star Platinum"},
                {"Hermit Purple", "Hierophant Green", "Magician Red","Silver Chariot", "Star Platinum"},
                {"Hermit Purple", "Hierophant Green", "Magician Red","Silver Chariot", "Star Platinum"},
                {"Hermit Purple", "Hierophant Green", "Magician Red","Silver Chariot", "Star Platinum"},
                {"Hermit Purple", "Hierophant Green", "Magician Red","Silver Chariot", "Star Platinum"},
                {"Jolyne", "Giorno", "Josuke", "Jotaro", "Joseph","Jonathan"},
                {"DIO", "Kira", "Pucci"}
            };
        final String[][] finalOrderArray = {
                {"Hermit Purple", "Hierophant Green", "Magician Red","Silver Chariot", "Star Platinum"},
                {"Star Platinum", "Silver Chariot", "Hermit Purple","Hierophant Green", "Magician Red"},{"Hermit Purple", "Silver Chariot", "Magician Red","Hierophant Green", "Star Platinum"},
                {"Magician Red", "Silver Chariot", "Hierophant Green", "Star Platinum", "Hermit Purple"},
                {"Magician Red", "Silver Chariot", "Hierophant Green","Hermit Purple", "Star Platinum"},
                {"Silver Chariot", "Magician Red", "Star Platinum","Hierophant Green", "Hermit Purple"},
                {"Jonathan", "Joseph", "Jotaro", "Josuke", "Giorno","Jolyne"},
                {"Pucci", "DIO", "Kira"}
            };

        for (int i = 0; i < N; i++) {
                System.out.printf("Case %d\n", i + 1);
                System.out.println(getActions(initialOrderArray[i],finalOrderArray[i]));
                }
            }   
}
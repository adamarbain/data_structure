package study.semDuaKosongSatuEnam.Q2;

import java.io.*;
import java.util.*;

public class BracMatch {

    public static void main(String[] args) {
        BracMatch br = new BracMatch();
        String temp = br.readingFile();
        if(checkMatcingBrackets(temp)){
            System.out.println("Yes - all matched");
        }
        else{
            System.out.println("Not all brackets matched.");
        }
    }
    
    public String readingFile (){
        System.out.println("String written in BracMatch.txt file: ");
        String temp = "";
        
        try(Scanner sc = new Scanner (new FileInputStream("C://Users//user//OneDrive//Desktop//degree//sem 2//wia 1002 data structure//DataStructure//src//study//semDuaKosongSatuEnam//Q2//BracMatch.txt"))){
            if(!sc.hasNextLine())
                System.out.println("There is no bracket in the input.");
            while(sc.hasNextLine()){                    
                String line = sc.nextLine(); 
                System.out.println(line);
                temp += line ;
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
        return temp;
    }
    
    
    public static boolean checkMatcingBrackets (String input){
        Stack<Character> stack = new Stack<>();
        
        for (char c : input.toCharArray()){
            if (checkingLeftBracket(c)){
                stack.push(c);
            }
            else if (checkingRightBracket(c)){
                if (stack.isEmpty())
                    return false;
            
            char leftBracket = stack.pop();
            if (!matchedPair(leftBracket,c)){
                return false;
                }
            }
        }
        return stack.isEmpty();
    }
    
    public static boolean checkingLeftBracket (char a){
        return a == '(' || a == '[' || a == '{' ;
    }
    
    public static boolean checkingRightBracket (char a){
        return a == ')' || a == ']' || a == '}' ;
    }
    
    public static boolean matchedPair (char left , char right){
        return (left == '(' && right == ')') ||
               (left == '[' && right == ']') ||
               (left == '{' && right == '}') ;
    }
    
}

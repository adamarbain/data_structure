package study.semDuaKosongSatuEnam.Q1;

import java.util.*;

public class Day {
        
    String[] day = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

    public void displayDay (){
        System.out.println("Specify your day in number:");
        for (int i = 0 ; i < day.length ; i ++){
            System.out.println((i+1)+" for " +day[i]);
        }
    }
    
    public void nextDay (int select) {
            if(select == 1){
                System.out.println("The name of the day is: " +day[0]);
                System.out.println("The following day of "+day[0]+" is: "+day[1]);
                System.out.println("The previous day of "+day[0]+" is: "+day[day.length-1]);
            }
            else if(select == (day.length)){
                System.out.println("The name of the day is: " +day[day.length-1]);
                System.out.println("The following day of "+day[day.length-1]+" is: "+day[0]);
                System.out.println("The previous day of "+day[day.length-1]+" is: "+day[day.length-2]);            
            }
            else{
                System.out.println("The name of the day is: " +day[select-1]);
                System.out.println("The following day of "+day[select-1]+" is: "+day[select]);
                System.out.println("The previous day of "+day[select-1]+" is: "+day[select-2]);
            }
        addingDay(select);
    }
    
    public void addingDay(int option){
        System.out.println("How many days to add to the specified/current day ("+day[option-1]+")?: ");
        Scanner scan = new Scanner (System.in);
        int daystoAdd = scan.nextInt();
        int a = daystoAdd + option;
        int showDay = daystoAdd ;
        if (a > 7){
        daystoAdd = ((option-1 + daystoAdd)%7)+1  ;
        System.out.println("The new day after the addition of "+showDay+" day(s) is: "+day[daystoAdd-1]);
        }
        else
        System.out.println("The new day after the addition of "+showDay+" day(s) is: "+day[a-1]);
            
    }

    public static void main(String[] args) {
        Day d = new Day();
        d.displayDay();
        Scanner sc = new Scanner (System.in);
        int selection = sc.nextInt();
        d.nextDay(selection);
    }
    
}



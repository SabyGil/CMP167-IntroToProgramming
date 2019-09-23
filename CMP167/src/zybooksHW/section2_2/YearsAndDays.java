package zybooksHW.section2_2;

import java.util.Scanner;

public class YearsAndDays {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter number of days:");
        int timeInDays = scnr.nextInt();
        int numDays = timeInDays % 365;

        if(timeInDays >= 365){
            int numYears = timeInDays / 365;
            System.out.println(numYears + " years and " + numDays + " days");
        } else {
            int numYears = 0;
            System.out.println(numYears + " years and " + numDays + " days");
        }
    }
}

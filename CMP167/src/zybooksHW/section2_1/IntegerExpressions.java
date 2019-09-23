package zybooksHW.section2_1;

import java.util.Scanner;

public class IntegerExpressions {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter firstInt:");
        int firstInt = scnr.nextInt();
        System.out.println("Enter secondInt:");
        int secondInt = scnr.nextInt();
        System.out.println("Enter thirdInt:");
        int thirdInt  = scnr.nextInt();

        int firstResult = (firstInt + secondInt) / thirdInt;
        int secondResult = (secondInt * thirdInt) / (firstInt + secondInt);
        int thirdResult = (firstInt * thirdInt) % secondInt;

        System.out.println("First Result = " + firstResult);
        System.out.println("Second Result = " + secondResult);
        System.out.println("Third Result = " + thirdResult);

    }

}

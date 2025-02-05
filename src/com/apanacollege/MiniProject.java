package com.apanacollege;

import java.util.Scanner;

public class MiniProject {
    public static void miniProject(){
        //generate random no and compare until user can guess correct no

        Scanner scanner = new Scanner(System.in);
        int myNumber = (int)(Math.random() * 100);
        int userNumber = scanner.nextInt();
        do{
            System.out.println("Guess my number(1 to 100) : ");;

            if (userNumber == myNumber){
                System.out.println("Whoo.... Correct Number");
            } else if (userNumber > myNumber) {
                System.out.println("Your number is too large");
            }
            else {
                System.out.println("Your number is too small");
            }
        }while(userNumber >= 0);
        System.out.println("My number was : ");
        System.out.println(myNumber);
    }
}

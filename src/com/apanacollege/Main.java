package com.apanacollege;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*System.out.println("Hello, World!");
        // Primitive Types
        byte age =30;
        int phone = 1234567890;
        long ph2 = 12345678900L;
        float pi = 3.14F;
        double pi2 = 3.14;
        char name = '@';
        boolean isAdult= false;

        //Non-Primitive Types
        //String
        String name2 = "Akash";
        //String Operation
         //lenght
        System.out.println(name2.length());

         //Concat
        String n1 = "Akash";
        String n2 = "Jyoti";
        String n3 = n1 + " and " + n2;
        System.out.println(n3);

         //charAt
        System.out.println(name2.charAt(0));

         //replace
        String n4 = "Babu";
        String n5 = n4.replace('a','b');
        System.out.println(n5);
        System.out.println(n4);

         //substring
        String n6 = "Akash and Jyoti";
        System.out.println(n6.substring(6, 9));

        //Arrays
        int[] marks= new int[3];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println( marks[2]);

         //Array length
        System.out.println(marks.length);
         //Array sort
        Arrays.sort(marks);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

         int[] marks1 = {97, 98, 95};
         int[][] finalMarks = {{97,98,95}, {95,95,98}};
        System.out.println("Final Marks " + finalMarks[0][0]);
        System.out.println("Final Marks " + finalMarks[1][1]);

        //casting - 1 type to another type
        // two types of casting Implicit or Explicit
         //Implicit Casting
        double price = 100.89;
        double finalPrice = price + 18;
        System.out.println("Final Price " + finalPrice);
          //Explicit Casting
        int p =100;
        int fp = p + (int)18.89;
        System.out.println("FP " + fp);
        //constant - value can not be change throughout the program
        final float PI = 3.14F; //"PI" used as naming
        // convention for Java coders to summarized constant can't be change


        //operators
        //conditional variables
        boolean isSunUp = false;
        if (isSunUp == true) {
            System.out.println("Day");
        }else {
            System.out.println("Night");
        }

        int age1 = 3;
        if (age1 > 18)
            System.out.println("Can Vote");
        else
            System.out.println("Can't Vote");

        // Logical Operator
        //&&
        int a = 30;
        int b = 60;
        if (a < 50 && b < 50)
            System.out.println("Both Less than 50");

        // || or operator
        if(a < 50 || b < 50)
            System.out.println("At least one less than 50");

        //Exception Handling
        //TRY-CATCH
        int[] m = {97,95,98};
        try{
            //Risky code
            System.out.println(m[5]);
        }catch (Exception e){
            //do things after caching
            System.out.println ("Exceed Array limit");
        }
        System.out.println("The name is Akash");*/


        //MINI PROJECT
        Scanner scanner = new Scanner(System.in);
        int myNumber = (int)(Math.random() * 100);
        int userNumber;
        do{
            System.out.println("Guess my number(1 to 100) : ");
            userNumber = scanner.nextInt();

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
package org.example.Arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ArrayDemo {

    public static void main(String args[]){

//        what is Arrays--> Array is a similar data elements
//        How to Create An Array in Java
        int arr [] = {1 , 2 , 3 , 4 , 5 , 6};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
//        second way to initialize an arrays

//        int brr[] = new int[5];
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Elements of Arrays");
//        for(int i=0;i<brr.length;i++){
//             brr[i] = sc.nextInt();
//        }
//
//        for (int i=0;i<brr.length;i++){
//            System.out.println(brr[i]);
//        }


//        we can also store string or characters in an arrays

        String[] strArr = {"Heelo", "Sumit","Babu","Vishwakarma"};
        for (int i = 0; i < strArr.length; i++) {
            System.out.print(strArr[i]+ " ");

        }

//        Updation
        strArr[2] = "CCNA";

        for (int i = 0; i < strArr.length; i++) {
            System.out.print(strArr[i]+ " ");

        }






    }
}

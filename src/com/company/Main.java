package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scanner.nextInt();

        int i;
        boolean check = true;
        if(number < 2) System.out.println("is not prime");
        else{
            for(i = 2;i<= Math.sqrt(number);i++){
                if(number %i ==0) check = false;
            }
            if(check)
                System.out.println("is prime");
            else
                System.out.println("is not prime");
        }
    }
}

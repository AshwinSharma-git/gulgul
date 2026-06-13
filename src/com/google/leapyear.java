package com.google;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class leapyear {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" enter year = ");
        int n = in.nextInt();
        if(n % 4 == 0 ) {
            if ( n % 100 != 0 ){
                System.out.println("it is a leap year ");
            } else if (n % 400 == 0 ) {
                System.out.println("it is a leap year ");
            } else {
               System.out.println("it is not a leap year ");
            }
        } else {
           System.out.println("it is not a leap year ");
        }
    }
}

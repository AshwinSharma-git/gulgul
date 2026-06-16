package com.google;

import java.util.Scanner;

public class simpleintrest {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(" enter principal amount = ");
        double p = in.nextDouble();
        System.out.print("enter time in years = ");
        double t = in.nextDouble();
        System.out.print("enter the rate of intrest = ");
        double r = in.nextDouble();
        double SI = (p*t*r)/100;
        System.out.println(" your intest amount is " + SI);

    }

}

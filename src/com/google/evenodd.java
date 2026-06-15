package com.google;

import java.awt.*;
import java.util.Scanner;

public class evenodd {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(" enter ur number = ");
        int n = in.nextInt(); // user number
        if ( n%2==0){
            System.out.println(" it is even ");
        }else {
            System.out.println(" it is odd ");
        }
    }
}

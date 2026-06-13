package com.google;

import java.util.Scanner;

public class tables {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for( int i = 1 ; i <= 10 ; i++ ){
            int table = n*i;
            System.out.println(" 2 x " +  i + " = "+ table);
        }
    }
}

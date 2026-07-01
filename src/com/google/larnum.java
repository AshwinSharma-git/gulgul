package com.google;

import java.util.Scanner;

public class larnum {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if(a==b){
            System.out.println("both are equal");
        } else if (a<b) {
            System.out.println(b);

        }else{
            System.out.println(a);
        }
    }
}

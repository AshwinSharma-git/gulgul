package com.google;

import java.util.Scanner;

public class userx {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while(true){
            String input = in.next();
            if(input.equalsIgnoreCase("x")){
                break;
            }
            int num = Integer.parseInt(input);
            sum+=num;
        }
        System.out.println(sum);
    }
}

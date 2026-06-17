package com.google;

import java.util.Scanner;

public class calculator {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print(" enter ur operator = ");
        String operator = in.next();
        System.out.print(" enter ur 1st no = ");
        int a = in.nextInt();
        System.out.print(" enter ur 2nd no  = ");
        int b = in.nextInt();

        if (operator.equals("+")){
            System.out.println(a+b);
        } else if (operator.equals("-")) {
            System.out.println(a-b);
        } else if (operator.equals("*")) {
            System.out.println(a*b);
        } else if (operator.equals("/")) {
            System.out.println(a/b);

        } else {
            System.out.println(" u have entered out of syllabus operator ");
        }

    }
}

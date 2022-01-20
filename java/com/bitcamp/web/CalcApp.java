package com.bitcamp.web;

import java.util.Scanner;

public class CalcApp {
    int n1,n2,fin = 0;
    String op = "+";

    void  calc(){
        Scanner scan = new Scanner(System.in);
        System.out.println("첫번째 숫자");
        n1 = scan.nextInt();
        System.out.println("두번째 숫자");
        n2 =  scan.nextInt();
        System.out.println("연산기호");
        String op = scan.next();
        fin = n1+n2;
        System.out.println(n1+ op + n2 + " " + " = " + fin);
    }


}

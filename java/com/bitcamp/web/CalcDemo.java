package com.bitcamp.web;

import java.util.Scanner;

public class CalcDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CalcApp calcApp = new CalcApp();
        System.out.println(calcApp.webSite);
        System.out.println("첫번째 숫자");
        System.out.println("두번째 숫자");
        System.out.println("연산기호");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        String op = scan.next();
        String result = calcApp.calc(n1, n2, op);
        System.out.println(result);
    }
}

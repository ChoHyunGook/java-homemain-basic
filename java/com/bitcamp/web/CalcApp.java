package com.bitcamp.web;

import java.util.Scanner;

public class CalcApp {
    public String webSite = "Calc world";
    int n1 = 0;
    int n2 = 0;
    String op = "";
    int fin = 0;

    public String  calc(int paramn1, int paramn2, String paramop){
        n1 =  paramn1;
        n2 =  paramn2;
        op = paramop;
        fin = n1 + n2;

       return n1+ op + n2 + " " + " = " + fin;


    }


}

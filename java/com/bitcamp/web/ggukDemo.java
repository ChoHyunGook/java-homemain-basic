package com.bitcamp.web;

import java.util.Scanner;

public class ggukDemo {
    public static void main(String[] args){
        ggukapp ggukApp = new ggukapp();

        Scanner scanner= new Scanner(System.in);
        System.out.println(ggukapp.webSite);
        System.out.println("Input ID: ");
        System.out.println("Input Password: ");
        System.out.println("Input Name: ");
        String id= scanner.next();
        String pw= scanner.next();
        String name=scanner.next();
        System.out.println("Output: ");
        String result = ggukApp.gguksapp(id , pw , name);
        System.out.println(result);
    }


}

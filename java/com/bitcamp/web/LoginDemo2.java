package com.bitcamp.web;

import java.util.Scanner;

public class LoginDemo2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        LoginApp2 loginApp2= new LoginApp2();
        System.out.println(LoginApp2.webSite);
        System.out.println("ID : ");
        System.out.println("PW : ");
        System.out.println("Name : ");
        String id =  scan.next();
        String pw =  scan.next();
        String name =  scan.next();
        String result = loginApp2.Login(id, pw, name);
        System.out.println(result);


    }
}

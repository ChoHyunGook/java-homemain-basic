package com.bitcamp.web;

import java.util.Scanner;

public class LoginDemo {
    public static void main(String[] args){
        LoginApp loginapp = new LoginApp();
        Scanner scan = new Scanner(System.in);
        System.out.println(LoginApp.webSite);
        System.out.println("id");
        System.out.println("pw");
        System.out.println("name");
        String id = scan.next();
        String pw = scan.next();
        String name = scan.next();
        System.out.println("Output: ");
        String result = loginapp.login(id,pw,name);
        System.out.println(result);
    }
}

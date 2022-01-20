package com.bitcamp.web;

import java.util.Scanner;


public class LoginApp {
    static String id = "";
    static String pw = "";
    static String name = "";

    void login(){
        Scanner scan = new Scanner(System.in);
        String website = "NAKKAO";
        System.out.println(website);
        System.out.println("id");
        id = scan.next();
        System.out.println("pw");
        pw = scan.next();
        System.out.println("name");
        name = scan.next();
        System.out.println(" ID "+ id+ " PW "+ pw + " NAME "
        + name);

    }









}


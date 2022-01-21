package com.bitcamp.web;

import java.util.Scanner;


public class LoginApp {
    public static String webSite = "NAKKAO";
    String id = "";
    String pw = "";
    String name = "";

    public String login(String paramId, String paramPw, String paramName){
        id = paramId;
        pw = paramPw;
        name= paramName;
        return " ID "+ id+ " PW "+ pw + " NAME " + name;

    }









}


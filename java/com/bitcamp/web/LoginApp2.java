package com.bitcamp.web;

public class LoginApp2 {
    public static String webSite = "NAKKAOLINE";
    private String id;
    private String pw;
    private String name;

    public String Login(String idPa,String pwPa, String namePa){
        id= idPa;
        pw= pwPa;
        name = namePa;
        return "ID : "+ id + "PW : " + pw + "Name : " + name;

    }
}

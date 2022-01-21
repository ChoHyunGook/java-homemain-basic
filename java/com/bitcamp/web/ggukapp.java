package com.bitcamp.web;

import java.util.Scanner;

public class ggukapp {
    public static String webSite = "GGUKS LAND";
    String id= "";
    String pw= "";
    String name= "";

    public String gguksapp(String paramId, String paramPw, String paramName){
        id =  paramId;
        pw = paramPw;
        name = paramName;

       return name+"님의 id는 "+id+" 이며, " +
                "패스워드는 "+pw+ "입니다.";

    }
}

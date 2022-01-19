package com.bitcamp.web;

import java.util.Scanner;

public class ggukapp {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("id를 입력하세요!");
        String id= scanner.next();
        System.out.println("password를 입력하세요!");
        String pw= scanner.next();
        System.out.println("성함을 입력해주세요!");
        String name=scanner.next();
        System.out.println(name+"님의 id는 "+id+" 이며, 패스워드는 "+pw+ "입니다.");
    }
}

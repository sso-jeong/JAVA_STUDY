package com.study.ch02;
/*
Date    : 2021-08-09
Source  : StringEx.java
Author  : 김소정
Topic   : 문자 리터럴과 문자열 리터럴
*/
class StringEx {
    public static void main(String[] args) {
        String name = "Ja" + "va";
        String str = name + 8.0;

        System.out.println(name); // Java
        System.out.println(str); // Java8.0
        System.out.println(7 + " "); // 7
        System.out.println(" " + 7); //  7
        System.out.println(7 + "");  // 7
        System.out.println("" + 7);  // 7
        System.out.println("" + "");  //
        System.out.println(7 + 7 + "");  // 14
        System.out.println("" + 7 + 7);  // 77
        
    }
}

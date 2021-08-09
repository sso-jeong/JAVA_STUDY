package com.study.ch02;
/*
Date    : 2021-08-09
Source  : VarEx1.java
Author  : 김소정
Topic   : 변수의 초기화란, 변수를 사용하기 전에 처음으로 값을 저장하는 것
*/

class VarEx1 {
    public static void main(String[] args) {
        int year = 0;
        int age = 14;

        System.out.println(year);
        System.out.println(age);

        year = age + 2000;
        age = age + 1;

        System.out.println(year);
        System.out.println(age);
    }
}

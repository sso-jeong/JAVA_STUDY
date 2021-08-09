package com.study.ch02;
/*
Date    : 2021-08-09
Source  : VarEx2.java
Author  : 김소정
Topic   : 두 변수의 값을 교환하는 것은 마치 두 컵에 담긴 내용물을 바꾸려면 컵이 하나 더 필요한 것과 같다.
*/
class VarEx2 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        int tmp = 0;

        System.out.println("x:" + x + " y:" + y);

        tmp = x;
        x = y;
        y = tmp;

        System.out.println("x:"+ x + " y:" +y);
    }

}

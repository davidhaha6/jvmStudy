package com.david.eight;

public class Test2 {

    public static void main(String[] args) {
        f1(1);
    }

    //栈针貌似是一个？为什么
    public static void f1(int i) {
        System.out.println(i);
        i++;
        if(i<10){
            f1(i);
        };

    }
}

package com.javaex.ex02;

public class Sparrow extends Bird {

    public void sing() {
    	System.out.println("참새("+name+")가 소리내어 웁니다.");
    }

    public void fly() {
    	System.out.println("참새("+name+")가 날아다닙니다.");
    }
    
    public void showName() {
    	System.out.println("참새의 이름은 "+name+" 입니다.");
    }
}

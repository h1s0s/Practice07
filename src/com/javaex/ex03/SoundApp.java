package com.javaex.ex03;

public class SoundApp {

    public static void main(String[] args) {
        printSound( new Cat() );
        printSound( new Dog() );
        printSound( new Sparrow() );
        printSound( new Duck() );
    }

    public static void printSound( Soundable soundable ) {
        /*
        내가 짠 코드 맞는지 모르겠음 복잡함
        if(soundable instanceof Dog) {	
        	System.out.println(((Dog)soundable).sound());
        } else if(soundable instanceof Cat) {
        	System.out.println(((Cat)soundable).sound());
        } else if(soundable instanceof Sparrow) {
        	System.out.println(((Sparrow)soundable).sound());
        } else {
        	System.out.println(((Duck)soundable).sound());
        }
        */
    	System.out.println(soundable.sound());
    }
    
}



package com.java8prac.lec1;

public interface Salutation {

    default void greet (){
        System.out.println("greeting from the  Salutation interface!");
    }

    default void salute(){
        System.out.print("Salute from Salutation interface");
    }
}

package com.java8prac.lec1;


public interface Greetings {



    /**
     *   <p>
     *       In Java 8 we can define the  methods with the help of keyword 'default'
     *   </p>
     *
     * */
    default void  greet(){
        System.out.println("Hello from Greetings interface");

    }


    default void toast(){
        System.out.println(" I can define method in  interface . Yay !!");

    }

}

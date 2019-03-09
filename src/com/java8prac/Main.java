package com.java8prac;



public class Main {


     public void perform(Greetings  greetings){
         greetings.greet();
     }


    public static void main(String[] args) {

        HelloWorldGreetings helloWorldGreetings= new HelloWorldGreetings() ;


	// write your code here

  Main main= new Main();
     Greetings greetings=   () ->{
             System.out.println("  Hello world greetings ");

        };

     main.perform(greetings);


    }
}

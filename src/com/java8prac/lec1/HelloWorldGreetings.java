package com.java8prac.lec1;

public  class HelloWorldGreetings implements  Greetings,Salutation {



 public static void main(String ... args ){

     Greetings greetings= new HelloWorldGreetings();
     greetings.toast();
     greetings.greet();

 }

 /**
 *  <p>
 *      The interface  {@link Greetings} has method  greet and  interface {@link Salutation} has also the method
  *      with exactly same name .    This creates diamond problem since class  implements both interface.
  *      In order to resolve this conflict , the class has specify definition of the method
 *  </p>
 *
 *
 * */
    @Override
    public void greet() {
          System.out.println("Greeting from  HelloWorldGreeting class !");
    }
}

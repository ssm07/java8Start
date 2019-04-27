package com.java8prac.lec1;

public class HelloWorldGreetings extends GreetingBase   implements  Greetings,Salutation   {



 public static void main(String ... args ){

     Greetings greetings= new HelloWorldGreetings();
     greetings.toast();
     greetings.greet();

     Salutation salutation= new HelloWorldGreetings();
     //The class GreetingBase and interface Salutation both has method salute.
     //following code will invoke method implementation from the class 'GreetingBase' since has higher precedence than interface.
     salutation.salute();

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

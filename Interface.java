public class Interface {
    public static void main(String[] args)
    {
        HiHello clsObj=new HiHello();
        System.out.println("Accessing methods from class using class object..");
        System.out.println(Inter.a);
        clsObj.printValue();
        clsObj.sayHello();
        clsObj.sayHi();
        clsObj.defaultWelcome();

        System.out.println("\nAccessing static methods..");
        clsObj.sayHihlo();      //Meaningless to call static method using class reference..When interface reference is used it throws an error
        HiHello.sayHihlo();
        Inter.sayHihlo();
        Inter.staticWelcome();
    }
}
interface Inter
{
    int a=5;
    void sayHello();
    default void defaultWelcome()
    {
        System.out.println("Default Welcome(not overridden)");
    }
    static void staticWelcome()
    {
        System.out.println("Static Welcome(not overridden)");
    }

    default void sayHi()
    {
        System.out.println("Hi from default method in interface");
    }

    static void sayHihlo()
    {
        System.out.println("Hihlo from static method from interface");
    }
}

class HiHello implements Inter
{
    void printValue()
    {
        System.out.println(a+" from implementation class");
    }
    @Override
    public void sayHello() {
        System.out.println("Hello..from overridden abstract method");
    }


    @Override
    public void sayHi() {
//        System.out.println("\nNow printing using Inter.super.sayHi in overridden default method from interface");
//        Inter.super.sayHi();
        System.out.println("Hi..from overridden default method");
    }

     static void sayHihlo()
    {
//        System.out.println("\nNow printing using Inter.sayHihlo from implementation class");
//        Inter.sayHihlo();
        System.out.println("Hihlo..from static method in class(not overridden technically)");
    }

}

/*
INTERFACE:
+ Properties in interface are public,static,final;
+ Methods in an interface are public,final and abstract by default
+ Data members are public,static and final.
+ Interfaces achieve 100% abstraction
+ An interface cannot contain a constructor
=>> Java8 Features
+ static and default methods with method body can be used
=>> Java9
+ private methods in interface were introduced


METHOD BODY IN INTERFACE:
+ Static and default methods should have method body
+ Abstract method does not have method body


OVERRIDING:
+ Abstract and Default methods are overridden
+ Static methods are not technically overridden


STATIC METHOD:
=>
+ Static methods from class and interface have separate memory allocations
+ So they are not technically overridden(if @override given error thrown)
=>
+ The method in class should be declared static as it has the same name as static method from interface(else compiler error)
+ Static method from interface can be accessed in implemented class and any other class using " Inter.method_name(); "
+ If static method does not have body in interface --> error --> static method in interface should have body


DEFAULT METHOD:
+ Default method while overridden in class is not declared default (else error)
+ Default method from interface can be accessed in implemented class using " Interface_name.super.method_name(); "
+ Default method in interface cannot be accessed from other than implementation classes
+ If default method in interface does not have body --> error --> extending method should have body

Main Method Alternative:
        Inter clsObj=new HiHello();
        System.out.println("Accessing methods from class using class object..");
        System.out.println(Inter.a);
        clsObj.sayHello();
        clsObj.sayHi();
        clsObj.defaultWelcome();
//clsObj.printvalue() --> error as this method is not in interface
        System.out.println("\nAccessing static methods..");
        HiHello.sayHihlo();
        Inter.sayHihlo();
        Inter.staticWelcome();
 */
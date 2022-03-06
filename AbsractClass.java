public class AbsractClass {
    public static void main(String[] args)
    {
        AbstractSubClass abstractObj=new AbstractSubClass();
        abstractObj.sing();
        abstractObj.play();
        abstractObj.getState();
        abstractObj.assignValue();
    }
}

abstract class NewAbstract{
    int a=5;

    void sing()
    {
        System.out.println("Singing..");
    }
    abstract void play();
    static void getState()
    {
        System.out.println("Static method in Abstract Class");
    }
    final void assignValue()
    {
        System.out.println("Final method in Abstract Class");
    }
    NewAbstract()
    {
        System.out.println("Constructor in Abstract Class");
    }
}

class AbstractSubClass extends NewAbstract
{
    void play()
    {
        System.out.println("Playing..");
    }
}

/*
+ Java does not support Abstract properties

+ abstract keyword is used with classes and methods

+ The class should be abstract if it contains an abstract method
+ An abstract class can have abstract and non-abstract methods
+ Abstract methods should be implemented in a subclass which extends the abstract class
+ It can have constructors,static and final methods
+ Static and final methods inside an abstract class cannot be abstract  --> illegal combination of modifiers
+ In an abstract class constructor is called first
 */
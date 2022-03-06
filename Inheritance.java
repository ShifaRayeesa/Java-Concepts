
public class Inheritance {
    public static void main(String[] args)
    {
        Parent square=new Parent();
        Parent parentChildSq=new ChildSquare();
        ChildSquare childSquare= new ChildSquare();

        square.squareArea();
        parentChildSq.squareArea();
        childSquare.squareArea();
        System.out.println(square.side);
        System.out.println(parentChildSq.side);
        System.out.println(childSquare.side);
    }
}

class Parent
{
    protected int side=5;
    void squareArea()
    {
        System.out.println((double) side*side);
    }
}
class ChildSquare extends Parent
{
    protected int side=10;
    @Override
    void squareArea()
    {
        System.out.println("Area of Square = "+side*side);
        System.out.println();
    }
}


/*
OVERRIDING
In java
 + Methods --> Overridden
 + State/Data-field/Property --> not Overridden
 + Overridden methods should have the same return type and access modifier

Keyword 'super'
 + used to access data-fields and methods from parent class in a child class
 */
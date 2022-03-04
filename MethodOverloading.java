public class MethodOverloading {
    public static void main(String[] args)
    {
        int side=4;
        int length=5;
        int breadth=3;
        float radius=2.5f;
        Overload overload=new Overload();
        System.out.println("Area of Square : "+overload.area(side));
        System.out.println("Area of Rectangle : "+overload.area(length,breadth));
        System.out.println("Area of Circle : "+overload.area(radius));
        System.out.println("\nTesting..\n"+overload.area(5,5.0f,5.0));
        System.out.println(overload.area(5.0,5.0f,5));
      //  System.out.println(overload.area(5.0f,5,5.0));
    }
}

class Overload{
    //Square
    int area(int side)
    {
        return side*side;
    }
    //Rectangle
    float area(int length,float breadth)
    {
        return (float)length*breadth;
    }
    //Circle
    float area(float radius)
    {
        return 2*3.14f*radius*radius;
    }
    //Testing for understanding behaviour
    double area(int a,float b,double c)
    {
        return a*b*c;
    }
    float area(double a,float b,int c)
    {
        return (float)a*b*c;
    }
    double area(float a,int b,double c)
    {
        return a*b*c;
    }
}
/*
If two methods have same number of variables in same order with same return type --> then these two methods cannot overload with different return types
If there are same no.of parameters in different order with same return type --> Overloads with same and different return types

 */

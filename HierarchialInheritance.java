public class HierarchialInheritance {
    public static void main(String[] args)
    {
        A1 obj1=new A1();
        obj1.A1();
        obj1.A();
        A2 obj2=new A2();
        obj2.A2();
        obj2.A();
    }
}
class A
{
    String parentName="Parent";
    void A()
    {
        System.out.println(parentName);
    }
}

class A1 extends A
{
    void A1()
    {
        System.out.println("Child A1 of " +parentName);
    }
}
class A2 extends A
{
    void A2()
    {
        System.out.println("Child A2 of "+parentName);
    }
}
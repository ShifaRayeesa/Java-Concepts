public class PrivateMethod implements privateInterface
{
    public void print()
    {
        System.out.println("Hi from implementation class");
    }

    public static void main(String[] args)
    {
        privateInterface obj=new PrivateMethod();
        privateInterface.publicMethod();
        obj.getvalue();
        obj.print();
    }
}

interface privateInterface
{
    default void getvalue()
    {
        setValue(10);
    }
    private void setValue(int a)
    {
        System.out.println(a);
    }

    private static void staticMethod()
    {
        System.out.println("This is a private static method");
    }

    static void publicMethod()
    {
        privateInterface.staticMethod();
    }

    void print();

}
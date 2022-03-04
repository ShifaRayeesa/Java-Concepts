public class ConstructorOverloading {
    public static void main(String[] args)
    {
        int a=5;
        String name="john";
        String password="$@ygkj676";
        Constructor obj;
        obj= new Constructor();
        obj= new Constructor(name,a);
        obj= new Constructor(name,password);
        obj= new Constructor(name,password,a);

    }
}

class Constructor{
    Constructor()
    {
        System.out.println("Default Constructor");
    }
    Constructor(String name ,int a)
    {
        System.out.println("Parameterised Constructor 1");
        System.out.println(name+"\n"+a);
    }
    Constructor(String name,String pwd)
    {
        System.out.println("Parameterised Constructor 2");
        System.out.println(name+"\n"+pwd);
    }
    Constructor(String name, String Pwd,int a)
    {
        System.out.println("Parameterised Constructor 1");
        System.out.println(name+"\n"+Pwd+"\n"+a);
    }
}
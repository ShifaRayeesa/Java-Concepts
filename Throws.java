import java.io.*;
class M{
    void method()throws IOException{
        throw new IOException("device error");
    }
}
public class Throws{
    public static void main(String args[])throws IOException
    {//declare exception
//        try
//        {
//            M m=new M();
//            m.method();
//        }
//        catch(IOException e)
//        {
//            System.out.println("Exception Handled..");
//        }
        M m=new M();
        m.method();
        System.out.println("normal flow...");
    }
}
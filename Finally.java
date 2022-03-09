public class Finally {
    public static void main(String[] args)
    {
        try
        {
            String string=null;
            int a=string.length();
            System.out.println(a);
        }
        catch (NullPointerException e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("Finally block is always executed");
        }
    }
}

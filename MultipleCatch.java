public class MultipleCatch {
    public static void main(String[] args)
    {
        try
        {
            int[] arr=new int[5];
            arr[5]=5/1;
            //arr[5]=5/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Code runs with or without exception");
    }
}

public class NestedTry {
    public static void main(String[] args)
    {
        try
        {
            try
            {
                int[] arr = new int[5];
                arr[5] = 5 / 1;
            }

            catch (ArithmeticException e)
            {
                System.out.println(e);
            }

            try
            {
                int[] arr = new int[5];
                arr[5] = 5 / 0;
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
            }
        }
        catch (Exception e)
        {
            System.out.println(e+" Exception Handled..");
        }
        System.out.println("Code runs with or without exception");
    }
}

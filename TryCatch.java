public class TryCatch {
    public static void main(String[] args)
    {
        System.out.println("Code starts executing.." );
        try
        {
            int divide=15/0;
            System.out.println("No Exception in this code..");
        }
        catch(ArithmeticException e)            //catch(Exception e)    -->   same O/P
        {
            System.out.println(e);              //  O/P  can be customised      -->     System.out.println("Cannot divide by Zero..");
            System.out.println("Statements in catch block..");      //Executes when exception occurs
        }
    }
}

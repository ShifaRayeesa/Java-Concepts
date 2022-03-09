public class Throw {
    public static void eligibility(int age)
    {
        if(age<18)
        {
            throw new ArithmeticException("Not Eligible");
        }
        else
        {
            System.out.println("Eligible");
        }
    }
    public static void main(String[] args)
    {
        eligibility(5);

    }
}

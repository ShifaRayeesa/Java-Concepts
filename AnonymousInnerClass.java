import java.util.Scanner;
interface Print{
    void print();
}

public class Anonymous {

    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the no.of pages to be printed : ");
        int pages= in.nextInt();
        Print obj=new Print() {
            @Override
            public void print() {
                for(int i=1;i<=pages;i++)
                    System.out.println("Printing page "+i+"..");
            }
        };
        obj.print();
    }
}

import java.util.Arrays;

public class Array {
    public static void main(String[] args)
    {
        int i;
        int[] arr;
        arr=new int[5];
        System.out.println(arr.length);
        for(i=0;i< arr.length;i++)
            System.out.print(i+1+" ");
        System.out.println("\n");
        for(i=0;i<5;i++)
        {
            arr[i]=i+1;
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
        arr=new int[7];
        for (i=1;i<=7;i++)
            System.out.print(i*2+" ");
        System.out.println("\n");
        for(i=0;i<7;i++)
        {
            arr[i]=i+1;
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
        //arr={1,2,3}   --> ERROR --> Array initializer not allowed here
        //int arr=new int[]{1,2,3};   --> ERROR -->   variable array is already defined in this scope
        int[] arr1=new int[]{3,6,9};
        //arr1={1,2,3};  --> ERROR --> Array initializer not allowed here
        System.out.println(Arrays.toString(arr1));
        int b=7;
        arr1[1]=b;          //the datatype of a should be lower to int --> Error for double datatype
        System.out.println(Arrays.toString(arr1));      //Arrays are mutable unlike Strings
        System.out.println("\nString Array:");
        String[] stringArray=new String[3];
        stringArray[0]="Alpha";
        stringArray[1]="Beta";
        stringArray[2]="Gamma";
        System.out.println(Arrays.toString(stringArray));

        System.out.println("\nCharacter Array:");
        char[] charArr={'a','b','c'};
        System.out.println(Arrays.toString(charArr));

        System.out.println("\nFloat Array:");
        float[] floatArr={1,2.0f,3.0f,4f};
        System.out.println(Arrays.toString(floatArr));

        int a=5;
        floatArr[1]=a;  //the datatype of a should be lower to float --> Error for double datatype
        System.out.println(Arrays.toString(floatArr));

        System.out.println("\nDouble Array:");
        double[] doubleArr={1,2.0,3.0f};   //implicitly converts int and float to double datatype
        System.out.println(Arrays.toString(doubleArr));
    }
}

import java.util.Arrays;

public class Array2D {
    public static void main(String [] args)
    {
        int[][] arr2d=new int[][]{{1,2,3},{4,5,6}};
//        int arr[][]=new int[2][3];
//        int[][] arr;
//        arr=new int[2][3];
        System.out.println(arr2d.length);   // no.of rows
        System.out.println("2D-Array:");
        for(int i=0;i< arr2d.length;i++)
        System.out.println(Arrays.toString(arr2d[i]));

        //Jagged Array
        //int[][] jaggedArray=new int[][]{{1,2,3,4,5},{6,7,8}};
        int[][] jaggedSample1=new int[][]
                {
                new int[]{1,2,3,4,5},
                new int[]{6,7,8}
                };
        int[][] jaggedSample2=new int[][]
                {
                        {1,2,3,4,5},
                        {6,7,8}
                };
        int[][] jaggedArray={{1,2,3,4,5},{6,7,8}};
        System.out.println("\n\nJagged Array:");
        for(int i=0;i< jaggedArray.length;i++)
        System.out.println("\n"+Arrays.toString(jaggedArray[i]));
        System.out.println();
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}

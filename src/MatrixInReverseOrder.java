import java.util.Scanner;

public class MatrixInReverseOrder {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[][]arr={
                {11, 22, 33},
                {10, 20, 30},
                {40, 50, 60}
        };
        for (int i= arr.length-1;i>=0;i--) {
            for (int j= arr.length-1;j>=0;j--) System.out.print(arr[i][j]+" ");
            System.out.println();
        }

    }
}

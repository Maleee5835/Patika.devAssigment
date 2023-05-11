import  java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int[][] arr1 = {
               {1,2,3},
               {5,6,7},
               {10,11,13},
               {14,15,17},
       };
       int[][] arr2 = new int[3][4];
       for (int i=0;i<arr1.length;i++){
           for (int j=0;j<=arr1[i].length;j++){
               arr2[i][j]=arr1[j][i];
               System.out.print(arr2[i][j] + " ");
           }
           System.out.println();
       }
    }
}

import java.util.ServiceLoader;
import  java.util.Arrays;
import java.util.Scanner;

public class Main {

       public static void main(String[] args) {

           Scanner input = new Scanner(System.in);

           String[][] arr = new String[6][4];


           for (int i=0;i<arr.length;i++){
               for (int j=0;j<arr[i].length;j++){
                   if (i==0 || i==2 || i==5){
                       arr[i][j]=" * ";
                   } else if (j == 0 || j == 3) {
                       arr[i][j]=" * ";
                   }else {
                       arr[i][j]="   ";
                   }
               }
           }
           for (String[] row : arr){
               for (String colm : row){
                   System.out.print(colm);
               }
               System.out.println();
           }

    }
}

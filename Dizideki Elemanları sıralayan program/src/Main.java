import java.util.ServiceLoader;
import  java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int boyut;

        System.out.print("Dizinin boyutunu giriniz:");
        boyut= input.nextInt();

        int[] arr = new int[boyut];

        for (int i=0;i<boyut;i++){
            System.out.print((i+1) + ". eleman:");
            arr[i]=input.nextInt();
        }
        Arrays.sort(arr);
        for (int i:arr){
            System.out.print(i + " ");
        }
    }
}

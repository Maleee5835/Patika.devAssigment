import java.util.ServiceLoader;
import  java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = {15, 23, 90, 8, 9, 15, 8, 90, 23, 15};
        int sayac=1;
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        for (int i=0;i<array.length;i++){
            if (i==0){
                for (int j=0;j<array.length;j++){
                    if (i!=j && array[i]==array[j]){
                        sayac++;
                    }
                }
                System.out.println(array[i] + " sayısı " + sayac + " kere tekrar edildi.");

            } else if (array[i] != array[i-1]) {
                for (int j=0;j<array.length;j++){
                    if (i!=j && array[i]==array[j]){
                        sayac++;
                    }
                }
                System.out.println(array[i] + " sayısı " + sayac + " kere tekrar edildi.");
            }
            sayac=1;
        }

    }
}

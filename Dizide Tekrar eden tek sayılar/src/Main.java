import java.util.ServiceLoader;
import  java.util.Arrays;
import java.util.Scanner;

public class Main {

    static boolean isFind(int[] arr,int value){
        for (int i : arr){
            if (i==value  ){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] array={1,2,3,85,8,55,96,6,64,28,8,3,5,5,7,8,9,11,55,55,65,915,54,3,2};
        int[] new_Array = new int[array.length];
        int a=0;
        for (int i=0;i< array.length;i++){
            for (int j=0;j<array.length;j++){
                if (i!=j && array[i]==array[j]){
                  if (!isFind(new_Array,array[i])){
                        new_Array[a++]=array[i];

                    }
                  break;

                }
            }
        }

        for (int value:new_Array){
            if (value%2==0 && value!=0){
                System.out.print(value + " ");
            }
        }

    }
}

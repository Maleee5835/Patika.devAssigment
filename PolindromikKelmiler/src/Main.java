import  java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;

//int random = (int)(Math.random()*100);
//System.out.println(random);
public class Main {
    static boolean is_Polindromik(String str){
        int i=0;
        int j=str.length()-1;

        while (i<j){
            if (str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    static  boolean is_Palindrom2(String str){

        String reverse="";
        for (int i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }
        return str.equals(reverse);
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(is_Polindromik("abba"));
        System.out.println(is_Palindrom2("BaBaBw"));
    }
}

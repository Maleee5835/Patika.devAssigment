import java.util.Scanner;
import java.math.*;
public class Java101 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int sayi;
        double sum=0,i=1;

        System.out.print("Sayı giriniz:");
        sayi=input.nextInt();


        while (i<=sayi){
            sum=sum+(1/i);
            i++;
        }
        System.out.println(sum);

    }
}


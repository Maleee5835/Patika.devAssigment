import java.util.Scanner;
import java.math.*;
public class Java101 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int sayi,i=1,sum=0,k,gecici;

        System.out.print("Sayi:");
        sayi=input.nextInt();

        gecici=sayi;

        while (sayi/10>0){
            sayi/=10;
            i++;
        }
        int m=i;
        sayi=gecici;

        while (m>0){
            k=sayi%10;
            sum+=Math.pow(k,i);
            sayi/=10;
            m--;
        }
        sayi=gecici;
        if (sayi==sum){
            System.out.println(sayi+" Armstrong sayıdır...");
        }else {
            System.out.println(sayi+"Armstrong sayı değildir!!!");
        }
    }
}


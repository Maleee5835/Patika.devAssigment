import java.util.Scanner;
import java.math.*;
public class Java101 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int sayi,us,k=0;
        double sum=0;

        System.out.print("Sayı:");
        sayi=input.nextInt();

        for (int i=1,  j = 1; i<=sayi && j <= sayi ; i*=4,j *= 5) {
            System.out.println(i+" "+j);
        }
    }
}

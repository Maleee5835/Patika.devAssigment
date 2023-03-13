import java.util.Scanner;
import java.math.*;
public class Java101 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int n,r,faktoriyeln=1,faktoriyelr=1;
        System.out.println("*************************************Kombinayon Hesaplama Simülasyonu*************************************");
        System.out.println("C(n,r)");

        System.out.print("n degeri:");
        n=input.nextInt();

        System.out.print("r degeri:");
        r=input.nextInt();
        int k=n-r;
        int faktoriyelm=1;
        double sonuc=1;
//C(n,r) = n! / (r! * (n-r)!)
        for (int i=1;i<=n;i++){
            faktoriyeln*=i;
        }
        for (int i=1;i<=r;i++){
            faktoriyelr*=i;
        }
        for (int i=1;i<=k;i++){
            faktoriyelm*=i;
        }
        sonuc=faktoriyeln/(faktoriyelr*(faktoriyelm));
        System.out.println(sonuc);
    }
}

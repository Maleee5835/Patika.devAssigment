import java.util.Scanner;
import java.math.*;

public class Java101 {
    public static void main(String[] args) {
        double a,b,c,d;
        Scanner input =new Scanner(System.in);
        System.out.print("Birinci dik kenar:");
        a=input.nextInt();
        System.out.print("İkinci dik kenar:");
        b=input.nextInt();
        a=Math.pow(a,2);
        b=Math.pow(b,2);
        c=a+b;
        d=Math.pow(c,0.5);
        System.out.println(d);


    }
}

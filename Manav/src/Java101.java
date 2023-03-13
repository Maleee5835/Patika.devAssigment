import java.util.Scanner;
import java.math.*;

public class Java101 {
    public static void main(String[] args) {
        double boy,kilo,VKE;
        Scanner input =new Scanner(System.in);
        /*
         Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL
        */
        double ar,el,dom,mu,pat;

        System.out.println("Armut:");
        ar=input.nextDouble();
        ar*=2.14;

        System.out.println("Elma:");
        el=input.nextDouble();
        el*=3.67;

        System.out.println("Domates:");
        dom=input.nextDouble();
        dom*=1.11;

        System.out.println("Muz:");
        mu=input.nextDouble();
        mu*=0.95;

        System.out.println("Patlıcan:");
        pat=input.nextDouble();
        pat*=5;

        double toplam=ar+el+dom+mu+pat;

        System.out.println(toplam);
    }
}

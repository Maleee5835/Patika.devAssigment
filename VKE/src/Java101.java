import java.util.Scanner;
import java.math.*;

public class Java101 {
    public static void main(String[] args) {
        double boy,kilo,VKE;
        Scanner input =new Scanner(System.in);
        System.out.print("Boy(metre cinsinden):");
        boy=input.nextDouble();
        System.out.print("Kilo:");
        kilo=input.nextDouble();
        VKE=kilo/(Math.pow(boy,2));
        System.out.println(VKE);
    }
}

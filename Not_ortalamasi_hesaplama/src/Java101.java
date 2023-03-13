import java.util.Scanner;
import java.math.*;
public class Java101 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int mat,fiz,kim,biy;
        double ortalama;

        System.out.print("Matematik notunuz:");
        mat=input.nextInt();

        System.out.print("Fizik notunuz:");
        fiz=input.nextInt();

        System.out.print("Kimya notunuz:");
        kim=input.nextInt();

        System.out.print("Biyoloji notunuz:");
        biy=input.nextInt();

        ortalama=(mat+fiz+kim+biy)/4;

        if(ortalama>50){
            System.out.println(ortalama);
            System.out.print("Sınıftan geçtiniz.\nTebriklerrr!!!");
        }else {
            System.out.print("Kaldınız!!!");
        }
    }


}

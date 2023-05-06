import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int sayi;

        System.out.print("Sayı giriniz:");
        sayi=input.nextInt();

        int gecici=0;
        gecici=sayi;
        for (int i=4;i<=sayi;i*=4){
            System.out.print(i +" ");
        }

        System.out.println();

        for (int i=5;i<=sayi;i*=5){
            System.out.print(i +" ");
        }

    }
}

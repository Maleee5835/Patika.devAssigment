import  java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
//int random = (int)(Math.random()*100);
//System.out.println(random);
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random new_Random = new Random();
        int number = new_Random.nextInt(100);
        int right=0;
        int select;
        int[] wrong=new int[5];
        boolean is_Wrong=false;
        System.out.println(number);
        while (right<5){
            System.out.print("Sayı giriniz:");
            select=input.nextInt();
            if (select<0 || select >100){
                System.out.println("Lütfen 0 ile 100 arasında sayı giriniz...");
                if (!is_Wrong){
                    System.out.println("Bir dahaki yanlış girişte hakkınızdan 1 eksilecektir!!!");
                    is_Wrong=true;
                }else {
                    right++;
                    System.out.println("Çok fazla yanlış girdiniz...Kalan hakkınız:" + (5-right));
                }
                continue;
            }
            if (select==number){
                System.out.println("Tebrikler,doğru tahmin ettiniz...\nSayınız: " +number);
                break;
            }else {
                System.out.println("Hatalı bir sayı girdiniz...");
                if (select>number){
                    System.out.println(select + " sayısı gizli sayıdan büyüktür.");
                }else {
                    System.out.println(select + " sayısı gizli sayıdan küçüktür.");

                }
                wrong[right]=select;
                right++;
                System.out.println("Kalan Hakkınız:" + (5-right));

            }
        }
        System.out.println("Girdiğiniz değerler:");
        for (int i:wrong){
            System.out.print(i + " ");
        }
    }
}

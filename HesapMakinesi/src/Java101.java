import java.util.Scanner;

public class Java101 {
    public static void main(String[] args) {
        int a,b;
        char secenek;
        Scanner input =new Scanner(System.in);
        System.out.println("*********************************Hesap Makinesi Programı*********************************");
        System.out.print("""
                Toplama için '+' tuşuna basınız
                Çıkartma için '-' tuşuna basınız
                Çarpma için '*' tuşuna basınız
                Bölme için '/' tuşuna basınız
                """);
        double sonuc;
        secenek=input.next().charAt(0);
        System.out.print("Birinci sayıyı giriniz:");
        a=input.nextInt();
        System.out.print("İkinci sayıyı giriniz:");
        b=input.nextInt();

        switch (secenek){
            case '+':
                sonuc=a+b;
                System.out.println(a +"+" +b +"="+sonuc);
                break;
            case '-':
                sonuc=a-b;
                System.out.println(a +"-" +b +"="+sonuc);
                break;
            case '*':
                sonuc=a*b;
                System.out.println(a +"*" +b +"="+sonuc);
                break;
            case '/':
                if ((b!=0)){
                    sonuc=a/b;
                    System.out.println(a +"/" +b +"="+sonuc);
                    break;  }
                else {
                    System.out.println("Hiçbir sayı 0'a bölünemez!!!");
                    break;
                }
            default:
                System.out.println("Yanlış bir ifade girdiniz.");
        }
    }
}

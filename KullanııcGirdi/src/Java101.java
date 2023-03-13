import java.util.Scanner;
public class Java101 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String kullanici_adı ,sifre,yeni_sifre;
        int secim;

        System.out.print("Kullanıcı adınızı giriniz:");
        kullanici_adı=input.nextLine();

        System.out.print("Şifrenizi giriniz:");
        sifre=input.nextLine();

        if(kullanici_adı.equals("Türkiye") && sifre.equals("1071")){
            System.out.println("Sisteme başarı ile giriş yaptınız...");
        } else if (kullanici_adı.equals("Türkiye") && !sifre.equals("1071")) {
            System.out.print("Şifrenizi yanlış girdiniz!!!\nYeni bir şifre için lütfen 1'e basınız...");
            secim=input.nextInt();
            if(secim==1){
                System.out.println("Oluşturacağınız şifreniz eski şifrenizle aynı olmamalı...");
                System.out.print("Yeni şifrenizi giriniz:");
                yeni_sifre=input.next();
                if(yeni_sifre.equals("1071")){
                    System.out.println("Şifre oluşturulamadı!!!");
                }else {
                    System.out.println("Yeni şifre oluşturuldu...");
                }
            }

        } else  {
            System.out.println("Kullanıcı adı ve şifre hatalı!!!");
        }

    }
}

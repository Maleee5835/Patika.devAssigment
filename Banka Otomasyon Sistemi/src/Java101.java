import java.util.Scanner;
import java.math.*;
public class Java101 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        String kullanici_adi,sifre;
        int giris_hakki=3,bakiye=1000,secenek,yatirilacak_tutar,cekilecek_tutar,havale_miktari;
        String cikis;

        while (giris_hakki>0) {
            System.out.print("Kullanıcı adınız:");
            kullanici_adi= input.nextLine();

            System.out.print("Şifreniz:");
            sifre=input.nextLine();

            if (kullanici_adi.equals("Maleee5835") && sifre.equals("123456")) {
                System.out.println("Sisteme başarı ile giriş yaptınız...");
                System.out.println("""
                        **************************************Bankamıza Hoş Geldiniz**************************************
               İşlemler:
                        1)Bakiye Sorgulama
                        2)Para Yatırma
                        3)Para Çekme
                 """);
                System.out.println("Çıkmak için q'ya,devam etmek için herhangi bir tuşa basınız!!!");
                cikis = input.nextLine();
                while (giris_hakki>0) {
                    if (cikis.equals("q")) {
                        System.out.println("Sistemden çıkılıyor...");
                        break;
                    } else {
                        System.out.print("Gerçekleştirmek istediğiniz işlemi:");
                        secenek = input.nextInt();

                        if (secenek == 1) {
                            System.out.println("Bakiyeniz:" + bakiye);
                        } else if (secenek == 2) {
                            System.out.println("Yatırmak istediğiniz tutar:");
                            yatirilacak_tutar = input.nextInt();
                            if (yatirilacak_tutar >= 0) {
                                if (yatirilacak_tutar%10==0){
                                    bakiye += yatirilacak_tutar;
                                }else {
                                    System.out.println("Sadece 10 ve 10'un katlarını yatırabilirsiniz!!!");
                                }
                            }else {
                                System.out.println("Negatif işlem yapamazsınız!!!");
                            }
                        } else if (secenek == 3) {
                            System.out.println("Çekmek istediğiniz tutar:");
                            cekilecek_tutar = input.nextInt();
                            if (cekilecek_tutar > bakiye ) {
                                System.out.println("Hesabınızda "+cekilecek_tutar+" tl kadar para bulunmamaktadır!!!");
                            } else if (cekilecek_tutar<=bakiye &&cekilecek_tutar%10!=0){
                                System.out.println("Yalnız 10 ve 10'un katlarını çekebilirisiniz!!!");
                            } else {
                                bakiye-=cekilecek_tutar;
                            }
                        } else {
                            System.out.println("Hatalı İşlem!!!");
                        }
                    }
                }
            } else {
                System.out.println("Hatalı Giriş!!!");
                giris_hakki--;
                System.out.println(giris_hakki + " giriş hakkınız kaldı!!!");

                if (giris_hakki == 0) {
                    System.out.println("Giriş hakkınız kaldı!!!");
                }
            }
        }
    }
}


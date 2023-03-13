import java.util.Scanner;
public class Java101 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        double mesafe;
        int yas,yolculuk_tipi;
        double toplam_ucret=1,gecici_ucret=1,son_ucret=1;

        System.out.print("Gidilecek mesafe(KM):");
        mesafe=input.nextDouble();

        System.out.print("Yaşınız:");
        yas=input.nextInt();

        System.out.print("Yolculuk Tipiniz(1-Tek Yön/2-Gidiş Dönüş)");
        yolculuk_tipi=input.nextInt();

        if(mesafe<0 || yas<0 || yolculuk_tipi<0 || yolculuk_tipi>2){
            System.out.println("Hatalı giriş yaptınız!!!");
        }else {
            toplam_ucret*=mesafe*0.1;
            if (yolculuk_tipi==1) {
                if (yas<12){
                    toplam_ucret*=0.5;
                } else if (yas>=12 && yas<=24) {
                    toplam_ucret*=0.9;
                } else if (yas>65) {
                    toplam_ucret*=0.7;
                } else if (yas>24&&yas<65) {
                    toplam_ucret*=1;
                }
            } else{
                if (yas<12){
                    toplam_ucret=toplam_ucret*0.5*0.8*2;
                } else if (yas>=12 && yas<=24) {
                    toplam_ucret=toplam_ucret*0.9*0.8*2;
                } else if (yas>65) {
                    toplam_ucret=toplam_ucret*0.7*0.8*2;
                }
            }
        }
        System.out.println("Ödemeniz gereken tutar:"+toplam_ucret);
    }
}

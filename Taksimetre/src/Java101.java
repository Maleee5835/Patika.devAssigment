import java.util.Scanner;

public class Java101 {
    public static void main(String[] args) {
        double gidilecek_mesafe,toplam_ucret;
        int acilis_miktari=10;
        Scanner input =new Scanner(System.in);
        System.out.print("Varış yerine olan uzaklık:");
        gidilecek_mesafe=input.nextInt();
        toplam_ucret=acilis_miktari+gidilecek_mesafe*2.20<20 ? 20 : acilis_miktari+gidilecek_mesafe*2.20;
        System.out.println("Alınan toplam ücret:"+toplam_ucret);
    }
}

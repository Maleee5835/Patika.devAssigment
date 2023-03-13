import java.util.Scanner;
public class Java101 {
    public static void main(String[] args) {
        int a;
        Scanner input =new Scanner(System.in);
        System.out.print("Alınan Miktar:");
        a=input.nextInt();
        System.out.println("KDV oranı %18'dir.");
        double kdvorani=(a>0)&&(a<1000) ? 1.18: 1.08;
        double b=a*kdvorani;
        double c=b-a;

        System.out.println("KDV'li değeri:" + b);
        System.out.println("KDV Tutarı:"+c);



    }
}

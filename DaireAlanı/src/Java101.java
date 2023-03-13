import java.util.Scanner;
import java.math.*;

public class Java101 {
    public static void main(String[] args) {
        double yari_cap,alan,cevre,derece,derece_alan;
        Scanner input =new Scanner(System.in);
        System.out.print("Daire diliminin derecesi:");
        derece=input.nextDouble();
        System.out.print("Yarıçapı giriniz:");
        yari_cap=input.nextDouble();
        alan=3.14*Math.pow(yari_cap,2);
        derece_alan=(alan*derece)/360;
        System.out.println(derece_alan);


    }
}

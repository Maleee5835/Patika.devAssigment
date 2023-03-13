import java.util.Scanner;
public class Java101 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int sayi;
        double sum=0;
        boolean sayi_Degeri=true;

        while (sayi_Degeri){
            System.out.print("Sayı giriniz:");
            sayi=input.nextInt();
            if(sayi<0){
                sayi_Degeri=false;
            }
            else if (sayi % 2 != 0) {
                sum += sayi;
            }
        }
        System.out.println(sum);
    }
}

//- girene kadar girilen sayılardan tek olanları toplar.
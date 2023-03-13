import java.util.Scanner;
import java.math.*;
public class Java101 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int s1,s2,i=1;
        boolean istrue=true;

        System.out.print("Üs alınacak sayi:");
        s1=input.nextInt();

        System.out.print("Üs degeri:");
        s2=input.nextInt();

        // double sonuc=Math.pow(s1,s2);

        //  System.out.println(sonuc + " ");

           /* while (i<s2){
                s1*=s1;
                i++;

            }*/
        for (i=1;i<s2;i++){
            s1*=s1;
        }
        System.out.println(s1);



    }
}

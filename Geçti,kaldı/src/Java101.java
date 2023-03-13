import java.util.Scanner;
public class Java101 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int mat,fizik,kimya,turkce,muzik;
        double avarage=0,new_avarage;
        System.out.print("Türkçe:");
        turkce=input.nextInt();
        if(0<=turkce && turkce<=100 ) {
            avarage+=turkce;
        }
        System.out.print("kimya:");
        kimya=input.nextInt();
        if (0<=kimya && kimya<=100){
            avarage+=kimya;
        }
        System.out.print("Matematik:");
        mat=input.nextInt();
        if (0<=mat && mat<=100){
            avarage+=mat;
        }
        System.out.print("Muzik:");
        muzik=input.nextInt();
        if (0<=muzik && muzik<=100){
            avarage+=muzik;
        }
        System.out.print("Fizik:");
        fizik=input.nextInt();
        if (0<=fizik && fizik<=100){
            avarage+=fizik;
        }
        new_avarage=avarage/5;
        if(new_avarage<55){
            System.out.println("Dersten kaldınız!!!");
            System.out.println("Puanınız:"+new_avarage);
        }else {
            System.out.println("Dersten geçtiniz...");
            System.out.println("Puanınız:"+new_avarage);
        }



    }
}

import java.util.Scanner;
public class Java101 {

    static boolean isPolindrom(int number){
        int temp=number,reverseNumber=0,lastNumber;
        while (temp!=0){
            lastNumber = temp % 10;
            reverseNumber=(reverseNumber*10)+lastNumber;
            temp/=10;
        }
        if (number==reverseNumber){
            System.out.println(number+" polindrom sayıdır.");
            return true;
        }else {
            System.out.println(number+" polindrom sayı değildir.");
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(isPolindrom(99));
    }
}

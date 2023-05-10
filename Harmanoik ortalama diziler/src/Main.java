import java.util.ServiceLoader;
import  java.util.Arrays;

public class Main {

       public static void main(String[] args) {
            double[] arr ={1,2};
            double harmonik=0;

            for(int i=0;i<arr.length;i++){
                harmonik+=1/(arr[i]);
            }
            double ortalama=arr.length/harmonik;
            System.out.println(ortalama);




    }
}

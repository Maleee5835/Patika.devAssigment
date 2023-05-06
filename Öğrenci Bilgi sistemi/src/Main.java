import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca","TRH","3333333333");
        Teacher t2 = new Teacher("Fatih","FZK","222222222");
        Teacher t3 = new Teacher("Deniz Benli","EBT","111111111");

        Course tarih = new Course("Tarih","101","TRH");
        Course fizik = new Course("Fizik","101","FZK");
        Course edbyt = new Course("Edebiyat","101","EBT");

        tarih.addTeacher(t1);
        fizik.addTeacher(t2);
        edbyt.addTeacher(t3);

        Student s1 = new Student("Mehmet Ali","12","Lise 4",tarih,fizik,edbyt);
        // s1.add_Bulk_Exam_Note(100,50,85);
        //s1.print_Note();
        //  s1.calculate_Avarage();
        //   s1.is_Pass();

        s1.add_Bulk_Verbal_Note(100,80,75);
        s1.add_Bulk_Exam_Note(50,75,25);

        s1.print_Note();
        System.out.println();
        s1.print_Verbal_Note();
        //Fizik notu %20 sözlü %80 Sınav
        //Edebiyat notu %30 sözlü %70 Sınav
        //Tarij notu %25 sözlü %70 Sınav

        s1.is_Pass();
    }
}

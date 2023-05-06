public class Student {
    Course c1;
    Course c2;
    Course c3;
    String ogrenci_Adi;
    String ogrenci_No;
    String ogrenci_Classes;
    double avarage;
    boolean isPass;
    Student(String ogrenci_Adi,String ogrenci_No,String ogrenci_Classes,Course c1,Course c2,Course c3){
        this.ogrenci_Adi=ogrenci_Adi;
        this.ogrenci_No=ogrenci_No;
        this.ogrenci_Classes=ogrenci_Classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.avarage=0.0;
        this.isPass=false;
    }
    void add_Bulk_Exam_Note(int note1,int note2,int note3){
        if (note1>=0 && note1<=100){
            this.c1.note=note1;
        }if (note2>=0 && note2<=100){
            this.c2.note=note2;
        }if (note3>=0 && note3<=100){
            this.c3.note=note3;
        }
    }void  print_Note(){
        System.out.println(this.c1.name + " notu:" + this.c1.note);
        System.out.println(this.c2.name + " notu:" + this.c2.note);
        System.out.println(this.c3.name + " notu:" + this.c3.note);

    }
    void add_Bulk_Verbal_Note(int vnote1,int vnote2, int vnote3){
        if (vnote1>=0 && vnote1<=100){
            this.c1.vnote=vnote1;
        }if (vnote2>=0 && vnote2<=100){
            this.c2.vnote=vnote2;
        }if (vnote3>=0 && vnote3<=100){
            this.c3.vnote=vnote3;
        }
    }void  print_Verbal_Note(){
        System.out.println(this.c1.name + " notu:" + this.c1.vnote);
        System.out.println(this.c2.name + " notu:" + this.c2.vnote);
        System.out.println(this.c3.name + " notu:" + this.c3.vnote);

    }void is_Pass(){
        //Fizik notu %20 sözlü %80 Sınav
        //Edebiyat notu %30 sözlü %70 Sınav
        //Tarij notu %25 sözlü %70 Sınav
        this.avarage=((this.c1.note*(0.75)+this.c1.vnote*(0.25) )+ (this.c2.note*(0.8)+this.c2.vnote*(0.2)) + (this.c3.note*(0.7)+this.c3.vnote*(0.3)))/3;
        System.out.println("******************Sınav notları******************");
        System.out.println(this.c1.name + " notu:" + this.c1.note);
        System.out.println(this.c2.name + " notu:" + this.c2.note);
        System.out.println(this.c3.name + " notu:" + this.c3.note);
        System.out.println("******************Sözlü notları******************");
        System.out.println(this.c1.name + " notu:" + this.c1.vnote);
        System.out.println(this.c2.name + " notu:" + this.c2.vnote);
        System.out.println(this.c3.name + " notu:" + this.c3.vnote);
        if (avarage>=55){
            System.out.println("Ortalamanız:" + avarage);
            System.out.println("Sınıfı geçtiniz...");
            isPass=true;
        }else
        {
            System.out.println("Sınıfta kaldınız!!!");
            isPass=false;
        }


        }
    void calculate_Avarage(){
        this.avarage=((this.c1.note*(0.75)+this.c1.vnote*(0.25) )+ (this.c2.vnote*(0.8)+this.c2.vnote*(0.2)) + (this.c3.note*(0.7)+this.c3.note*(0.3)))/3;
        System.out.println("Yours avarage of notes:" + this.avarage);

        }
    }

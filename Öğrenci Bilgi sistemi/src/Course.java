public class Course {
    String name;
    String code;
    String prefix;
    int note;
    int vnote;
    Teacher teacher;

    Course(String name,String code, String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        int note=0;
        int vnote=0;
    }
    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher=teacher;
        }else {
            System.out.println("Öğretmen ve Ders uyuşmuyor!!!");
        }
    }
    void course_Print_Info(){
        System.out.println("Dersin adı:" + this.name);
        System.out.println("Dersin kodu:" + this.code);
        System.out.println("Dersin prefixi:" + this.prefix);
        this.teacher.print_Info();


    }

}
//Nitelikler : name,code,prefix,note,Teacher
//Metotlar : Course() , addTeacher() , printTeacher()
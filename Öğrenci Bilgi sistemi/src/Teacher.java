public class Teacher {
    String name;
    String branch;
    String  mpno;

    Teacher(String name,String branch,String  mpno){
        this.name=name;
        this.branch=branch;
        this.mpno=mpno;
    }
    void print_Info(){
        System.out.println("Adı:" + this.name);
        System.out.println("Branşı:" + this.branch);
        System.out.println("Numarası:" + this.mpno);

    }
}
//Nitelikler : name,mpno,branch
//Metotlar : Teacher()
//mpno=mobile phone number
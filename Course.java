public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    int sNote;

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
        int sNote = 0;
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(prefix)){
            this.teacher = teacher;
        }else{
            System.out.print("Ogretmen ve ders bolumleri uyusmuyor");
        }

    }

    void printTeacher(){
        this.teacher.print();
    }
}

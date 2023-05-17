public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;
    Student(String name , String stuNo , String classes , Course c1 , Course c2 , Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }
    void efectNote(int sNote1 , int sNote2 , int sNote3){
        this.c1.sNote = sNote1;
        this.c2.sNote = sNote2;
        this.c3.sNote = sNote3;
    }
    void addBulkExamNote(int note1 , int note2 , int note3){
        if(note1 >=0 && note1 <= 100){
            this.c1.note = note1;
        }
        if(note2 >= 0 && note2 <= 100){
            this.c2.note = note2;
        }
        if(note3 >= 0 && note3 <= 100){
            this.c3.note = note3;
        }

    }
    void isPass(){
        this.avarage = (((this.c1.sNote*0.20)+(this.c1.note*0.80))+((this.c2.sNote*0.20)+ (this.c2.note*0.80)) +((this.c3.sNote*0.20)+ (this.c3.note*0.80))) / 3.0;
        if(this.avarage>55){
            System.out.println("Sinifi gectiniz!");
            this.isPass = true;
        }else{
            System.out.println("Sinif tekrarina kaldiniz!");
            this.isPass = false;
        }
        printNote();
    }

    void printNote(){
        System.out.println(this.c1.name + " Notu\t:" + this.c1.note);
        System.out.println(this.c2.name + " Notu\t:" + this.c2.note);
        System.out.println(this.c3.name + " Notu\t:" + this.c3.note);
        System.out.println(this.c1.name + "\tSozlu Notu\t:" + this.c1.sNote);
        System.out.println(this.c2.name + "\tSozlu Notu\t:" + this.c2.sNote);
        System.out.println(this.c3.name + "\tSozlu Notu\t:" + this.c3.sNote);
        System.out.println("Ortalamaniz : " + this.avarage);
        System.out.println("===============");
    }
}

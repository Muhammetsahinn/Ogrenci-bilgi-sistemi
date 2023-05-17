import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Teacher t1 = new Teacher("Mahmut", "TRH", "5325518151");
        Teacher t2 = new Teacher("Ali" , "FZK" , "5050505050");
        Teacher t3 = new Teacher("Ersoy" , "KMY" , "5428915165");

        Course tarih = new Course("tarih","101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("fizik", "102" , "FZK");
        fizik.addTeacher(t2);

        Course kimya = new Course("kimya" , "103" , "KMY");
        kimya.addTeacher(t3);

        Student s1 = new Student("Ahmet" , "6545" , "4", tarih , fizik , kimya);
        s1.addBulkExamNote(100,80,50);
        s1.efectNote(80,50,60);
        s1.isPass();

        Student s2 = new Student("Veli" , "2131" , "4" , tarih , fizik , kimya);
        s2.addBulkExamNote(20 , 45 , 100);
        s2.efectNote(50,60,80);
        s2.isPass();

        }

}



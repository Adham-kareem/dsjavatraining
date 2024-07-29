package oopsjava;
import java.util.*;

public class ClassObjects {
    public static void main(String[] args) {
        Trainer trainer = new Trainer();
        trainer.trainerName ="pawan sharma";
        trainer.trainerTechnology ="JAVA";

        System.out.println("My name is:"+trainer.trainerName +"My technology is:"+  trainer.trainerTechnology);

        Student student=new Student();
        System.out.println("enter student name:");
        Scanner scanner=new Scanner(System.in);
        student.studentName=scanner.nextLine();
        System.out.println("enter the enrolled technology:");
        student.studentEnrolledTechnology= scanner.nextLine();




    }
}

class Trainer{
    String trainerName;
    String trainerTechnology;

}

class Student{
    String studentName;
    String studentEnrolledTechnology;

}


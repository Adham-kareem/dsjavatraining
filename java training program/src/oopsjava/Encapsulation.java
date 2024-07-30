package oopsjava;

public class Encapsulation {
   

    public static void main(String[] args) {
        //to print the trainer profile
        Trainers trainers = new Trainers();
        //data add using object and reference
        trainers.name ="pawan sharma";
        trainers.email ="pawan@gmail.com";
        trainers.technology ="JAVA";

        System.out.println(trainers.name + " "+trainers.email +" "+trainers.technology);
        
        
        
        //2.data add using object and methods
        Trainers.printprofile("pawan sharma"+ "pawana@gmail.com"+"JAVA");
    }
}
class Trainers{
    String name;
    String email;
    String technology;


    public static void printprofile(String s) {
    }
}

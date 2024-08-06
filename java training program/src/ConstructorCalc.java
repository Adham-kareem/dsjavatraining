import java.util.Scanner;

public class ConstructorCalc {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter 1st no.");
        int a= sc.nextInt();
        System.out.println("enter 2nd no.");
        int b= sc.nextInt();
        System.out.println(" enter your choice \n  1 for addition \n  2 for subtraction \n  3 for multiplication \n  4 for division \n");
        int c = sc.nextInt();
        Calculator calculator= new Calculator(a,b,c);
    }
}

class Calculator{


    public Calculator(int a, int b, int choice) {
        this.a = a;
        this.b = b;
        this.c = choice;
       switch (choice){
           case 1:
               System.out.println(a+b);
               break;
           case 2:
               System.out.println(a-b);
               break;
           case 3:
               System.out.println(a*b);
               break;
           case 4:
               System.out.println(a/b);
               break;
           default:
               System.out.println("enter valid number");
       }


    }
    int a,b,c;

}

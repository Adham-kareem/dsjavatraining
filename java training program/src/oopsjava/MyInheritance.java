package oopsjava;
import java.util.Scanner;

public class MyInheritance {
    public static void main(String[] args) {
        inheritance Inheritance = new inheritance();
        Inheritance.print();

    }

}


class inheritance extends calculate{
    void print(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the values ");
        int a=scanner.nextInt();
        System.out.print("enter 2nd value ");
        int b=scanner.nextInt();

        System.out.println(add(a,b));
        System.out.println(sub(a,b));
        System.out.println(mul(a,b));
        System.out.println(div(a,b));
    }
}


class calculate {
    int add(int a,int b){
        return a+b;

    }
    int mul(int a,int b){
        return a*b;
    }
    int sub(int a,int b){
        return a-b;
    }
    int div(int a,int b){
        return a/b;
    }
}
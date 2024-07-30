package oopsjava;

public class MyInheritance {
    public static void main(String[] args) {
        inheritance Inheritance = new inheritance();
        Inheritance.print();

    }

}

class inheritance extends calculate{
    void print(){
        System.out.println(add(8,4));
        System.out.println(sub(8,4));
        System.out.println(mul(8,4));
        System.out.println(div(8,4));
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
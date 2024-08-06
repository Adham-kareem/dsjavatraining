public class constructordemo {
    public static void main(String[] args) {
        //call the constructor object
        MyClass myClass=new MyClass(5,8);
        System.out.println("C = "+myClass.c);
        System.out.println(("D = "+myClass.d));

    }
}

class MyClass{
    //parameter constructor


    public MyClass(int a, int b) {
        c = a;
        this.d = b;
        System.out.println(a+b);
    }
    int c,d;
}

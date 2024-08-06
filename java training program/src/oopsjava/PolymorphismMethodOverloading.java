package oopsjava;

public class PolymorphismMethodOverloading {
    public static void main(String[] args) {
        //method calling for addition integer
        // int result= add(5,6);

         System.out.print(" m1 =" + add(2,9) + "  M2 =" + add(2.5,9.3));

    }



    private static double add(double v, double v1) {

        return v + v1;
    }


    private static int add(int i, int i1) {

        return i+ i1 ;
    }
}

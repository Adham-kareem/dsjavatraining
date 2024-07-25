package apanacollege;

import java.util.*;

public class factorial {
    
    public static void PrintFactorial(int n){
        if(n<0){
            System.out.println("invalid number!");
            return;

        }
        int factorial=1;
        for(int i=n;i>=1;i--){
            factorial=i*factorial;


        }
        System.out.println(factorial);
        return;

    }
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PrintFactorial(n);
        
    }
    
}

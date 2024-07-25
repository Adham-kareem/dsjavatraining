package project1;

import java.util.Random;

public class GenerateOtp {
    public static void main(String[] args) {
        //to generate 6 digit otp random class used
        Random random = new Random();
        int myOtp = random.nextInt(1000000); // 6 times 0
        System.out.println("Your Java OTP is: "+ myOtp+" don't share to anyone");
    }
}
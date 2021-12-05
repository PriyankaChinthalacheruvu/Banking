package com.greatlearning.week4;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Login {

    int acc;
    int pass;
    int otp;
    public void getLoginDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the account number(Hint -- 1011,1012,1013):");
        acc = scanner.nextInt();
        System.out.println("Enter the Password(Hint -- 1111,1112,1113):");
        pass = scanner.nextInt();
    }

    public void getRandomOtp(){
        Random r = new Random();
        otp = 1000 + r.nextInt(100000);
        System.out.println("Enter OTP : "+ otp);
    }

    public boolean verifyOtp(){
        Scanner scanner = new Scanner(System.in);
        int token = scanner.nextInt();
        if(token == otp){
            return true;
        }
        else
            return false;
    }


    public void verify() throws Exception{
        HashMap<Integer,Integer> map = new HashMap<>(); //hardcoded Login details
        map.put(1011,1111);
        map.put(1012,1112);
        map.put(1013,1113);

        if(map.get(acc)==pass){
        //if(true){
            System.out.println("Welcome to Indian Bank....!!!!");
            Customers customers = new Customers();
            customers.enterMenu(acc);

        }
        else {

            System.out.println("Invalid Credentials...!!!");
            getLoginDetails();
        }

    }
}

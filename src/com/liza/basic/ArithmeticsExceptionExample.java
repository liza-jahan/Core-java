package com.liza.basic;

public class ArithmeticsExceptionExample {
    public static void main(String[] args) {
        try {
            System.out.println(4 / 0);
        }catch (ArithmeticException e){
            System.out.println("Number can not divided by 0");
        }
    }
}

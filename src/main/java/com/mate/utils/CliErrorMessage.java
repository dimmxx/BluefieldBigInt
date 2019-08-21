package com.mate.utils;

public class CliErrorMessage {

    public static void printError(){
        
        System.out.println("\nWrong parameters");
        System.out.println("usage: ./multiply.sh  --alg1(alg2) number1 number2\n");
    }
}

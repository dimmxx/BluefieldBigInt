package com.mate;

import com.mate.utils.CheckInput;
import com.mate.utils.CliErrorMessage;

public class App {

    public static void main(String[] args) {
        if (args.length != 3) CliErrorMessage.printError();

        long startTime = System.currentTimeMillis();
        long stopTime;
        String result = "0";

        if (args[1].equals("0") || args[2].equals("0")) {
            stopTime = System.currentTimeMillis();
            System.out.println("\nResult: " + result + " [Time elapsed: "
                    + (stopTime - startTime) + "ms]\n");
        }

        try {
            CheckInput.checkInputOpt(args[0]);
            CheckInput.checkInputNumber(args[1]);
            CheckInput.checkInputNumber(args[2]);
        } catch (IllegalArgumentException e) {
            CliErrorMessage.printError();
            System.exit(0);
        }

        Calculate calculateManual = new CalculateManual();
        Calculate calculateBigInteger = new CalculateBigInteger();

        switch (args[0]) {
            case "--alg1":
                System.out.println("\nUsing algorithm 1: ");
                result = calculateManual.multiply(args[1], args[2]);
                stopTime = System.currentTimeMillis();
                System.out.println("Result: " + result
                        + " [Time elapsed: " + (stopTime - startTime) + "ms]\n");
                break;

            case "--alg2":
                System.out.println("\nUsing algorithm 2: ");
                result = calculateBigInteger.multiply(args[1], args[2]);
                stopTime = System.currentTimeMillis();
                System.out.println("Result: " + result
                        + " [Time elapsed: " + (stopTime - startTime) + "ms]\n");
        }
    }
}
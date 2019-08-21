package com.mate.utils;

public class ConvertStringToArray {

    public static int[] convert(String num) {

        int[] intArray = new int[num.length()];
        String[] stringArray = num.split("");
        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        return intArray;
    }

}
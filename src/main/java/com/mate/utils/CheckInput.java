package com.mate.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckInput {

    public static void checkInputNumber(String number) throws IllegalArgumentException{
        Pattern pattern = Pattern.compile("^[0-9]+$");
        Matcher matcher = pattern.matcher(number);
        boolean found = matcher.matches();
        if(!found){
            throw new IllegalArgumentException();
        }
    }

    public static void checkInputOpt(String option) throws IllegalArgumentException{
        Pattern pattern = Pattern.compile("^--alg[1-2]$");
        Matcher matcher = pattern.matcher(option);
        boolean found = matcher.matches();
        if(!found){
            throw new IllegalArgumentException();
        }
    }
}

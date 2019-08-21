package com.mate;

import com.mate.utils.ConvertStringToArray;
import java.util.Arrays;

public class CalculateManual implements Calculate {

    @Override
    public String multiply(String num1, String num2) {

        int[] num1Array = ConvertStringToArray.convert(num1);
        int[] num2Array = ConvertStringToArray.convert(num2);

        int matrixLength = num1Array.length > num2Array.length ? num1Array.length * 2 : num2Array.length * 2;
        int[][] matrix = new int[matrixLength / 2][matrixLength];

        for (int i = 1; i <= num2Array.length; i++) {
            int nextDigit = 0;
            for (int j = 1; j <= num1Array.length; j++) {
                int temp = num2Array[num2Array.length - i] * num1Array[num1Array.length - j] + nextDigit;
                nextDigit = 0;
                if (temp < 10) {
                    matrix[i - 1][matrixLength - j - i + 1] = temp;
                } else {
                    if (j == num1Array.length) {
                        matrix[i - 1][matrixLength - j - i + 1] = temp - (temp / 10 * 10);
                        matrix[i - 1][matrixLength - j - i] = temp / 10;
                    } else {
                        matrix[i - 1][matrixLength - j - i + 1] = temp - (temp / 10 * 10);
                        nextDigit = temp / 10;
                    }
                }
            }
        }

//        for (int i = 0; i < matrixLength / 2; i++) {
//            System.out.println(Arrays.toString(matrix[i]));
//        }

        int[] resultArray = new int[matrixLength];
        for (int i = 0; i < matrixLength / 2; i++) {
            int tempSum = 0;
            int nextDigit = 0;
            for (int j = 1; j <= matrixLength; j++) {
                tempSum = resultArray[matrixLength - j] + matrix[i][matrixLength - j] + nextDigit;
                nextDigit = 0;
                if (tempSum < 10) {
                    resultArray[matrixLength - j] = tempSum;
                } else {
                    nextDigit = tempSum / 10;
                    resultArray[matrixLength - j] = tempSum - (tempSum / 10 * 10);
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < resultArray.length; i++) {
            stringBuilder.append(resultArray[i]);
        }
        return stringBuilder.toString().replaceFirst("^0+(?!$)", "");
    }
}
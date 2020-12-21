package org.example.lesson3;

import java.util.ArrayList;

public class MainApp {

    public static int SumAllIndexArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (array.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException();
            }
        }

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[0].length; j++) {

                try {
                    int value = Integer.parseInt(array[i][j]);
                    sum += value;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j, array);
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {


        String[][] array = {
                {"2", "3", "4", "1"},
                {"5", "6", "6", "7"},
                {"1", "1", "1", "5"},
                {"2", "3", "4", "i"}};
        try {
            int sum = SumAllIndexArray(array);
            System.out.println(sum);
        } catch (MyException e) {
            System.out.println("ignored");
        }
    }
}

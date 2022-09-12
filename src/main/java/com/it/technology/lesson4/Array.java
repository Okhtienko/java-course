package com.it.technology.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    private int size;
    private static String message;
    private int[] data;

    private static final int LOWER_BORDER = -10;
    private static final int UPPER_BORDER = 10;
    private static final int MIN_SIZE_ARRAY = 5;
    private static final int MAX_SIZE_ARRAY = 10;

    public void setSize(int size) {
        this.size = size;
        data = new int[size];
    }

    public static String getMessage() {
        return message;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public void fillingArrayRandomNumbers() {
        for (int i = 0; i < data.length; i++) {
            data[i] = (int) (Math.random() * (UPPER_BORDER - LOWER_BORDER + 1)) + LOWER_BORDER;
        }
    }

    public void printingValuesArray() {
        for (int value : data) {
            System.out.print(value + " ");
        }
    }

    public void searchNumberArray(int number) {
        for (int value : data) {
            if (value == number) {
                message = "The number's in the array";
                break;
            }
            else {
                message = "The number's not in the array";
            }
        }
    }

    public void removeElementsArray (int key) {
        data = Arrays.stream(data).filter(value -> value != key).toArray();
    }

    public int findingMinimumElementArray() {
        int min = data[0];
        for (int value : data) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public int findingMaximumElementArray() {
        int max = data[0];
        for (int value : data) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public double findingAverageValueArray() {
        int sum = 0;
        for (int value : data) {
            sum += value;
        }
        return (double) sum/data.length;
    }

    public static void comparisonArithmeticValues(double firstArithmeticValue, double secondArithmeticValue) {
        if (firstArithmeticValue == secondArithmeticValue) {
            message = "The values are equal";
        }
        else if (firstArithmeticValue > secondArithmeticValue) {
            message = "The first value is greater";
        }
        else {
            message = "The second value is greater";
        }
    }

    public void replacingElementsOddPositions() {
        for (int i = 0; i < data.length; i++) {
            if (i % 2 != 0) {
                data[i] = 0;
            }
        }
    }

    private void swap(int counter) {
        int temp = data[counter];
        data[counter] = data[counter + 1];
        data[counter + 1] = temp;
    }

    public void bubbleSort() {
        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < data.length-1; i++) {
                if(data[i] > data[i+1]){
                    isSorted = false;
                    swap(i);
                }
            }
        }
    }

    public static int arraySizeCheck(Scanner object) {
        int value = 0;
        while ((value <= MIN_SIZE_ARRAY) || (value > MAX_SIZE_ARRAY)) {
            if (object.hasNextInt()) {
                value = object.nextInt();
                if ((value <= MIN_SIZE_ARRAY) || (value > MAX_SIZE_ARRAY)) {
                    System.out.print("Re-enter the number: ");
                }
            }
            else {
                System.out.print("You didn't enter a number. Re-enter the number: ");
                object.next();
            }
        }
        return value;
    }

    public int numberEvenArrayElements(int[] array) {
        int counter = 0;
        for (int value : array) {
            if (value % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    public Array creatingArrayEvenElements() {
        Array evenArray = new Array();
        evenArray.setSize(numberEvenArrayElements(data));
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 0) {
                evenArray.data[index++] = data[i];
            }
        }
        return evenArray;
    }
}

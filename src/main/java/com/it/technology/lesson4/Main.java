package com.it.technology.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("############Task0############\n");

        System.out.print("Enter the size of the array: ");
        int sizeArray = scanner.nextInt();
        Array array = new Array();
        array.setSize(sizeArray);
        array.fillingArrayRandomNumbers();
        array.printingValuesArray();
        System.out.print("\nEnter the number: ");
        int number = scanner.nextInt();
        array.searchNumberArray(number);
        System.out.print(array.getMessage());

        System.out.print("\n\n############Task1############\n");

        System.out.print("Enter the value of the element to be removed: ");
        int removedElement = scanner.nextInt();
        array.removeElementsArray(removedElement);
        array.printingValuesArray();

        System.out.print("\n\n############Task2############\n");

        System.out.print("Minimum number in array: " + array.findingMinimumElementArray() + "\n");
        System.out.print("Maximum number in array: " + array.findingMaximumElementArray() + "\n");
        System.out.print("Array averages: " + array.findingAverageValueArray() + "\n");

        System.out.print("\n############Task3############\n");

        Array arrayFirst = new Array();
        Array arraySecond = new Array();
        int[] a1 = new int[]{1, 2, 3, 4, 5};
        int[] a2 = new int[]{1, 2, 3, 4, 6};
        arrayFirst.setData(a1);
        arraySecond.setData(a2);
        System.out.print("First array: ");
        arrayFirst.printingValuesArray();
        System.out.print("\nSecond array: ");
        arraySecond.printingValuesArray();
        double firstArithmetic = arrayFirst.findingAverageValueArray();
        double secondArithmetic = arraySecond.findingAverageValueArray();
        System.out.print("\nAverage value of the first array: " + firstArithmetic + "\n");
        System.out.print("Average value of the second array: " + secondArithmetic + "\n");
        Array.comparisonArithmeticValues(firstArithmetic, secondArithmetic);
        System.out.print(Array.getMessage());

        System.out.print("\n\n############Task4############\n");

        System.out.print("Enter the size of the array: ");
        int value = Array.arraySizeCheck(scanner);
        Array arr = new Array();
        arr.setSize(value);
        System.out.print("Array: ");
        arr.fillingArrayRandomNumbers();
        arr.printingValuesArray();
        System.out.print("\nArray of even elements: ");
        Array eventArray = arr.creatingArrayEvenElements();
        eventArray.printingValuesArray();

        System.out.print("\n\n############Task5############\n");

        Array replaceArray = new Array();
        replaceArray.setSize(5);
        replaceArray.fillingArrayRandomNumbers();
        System.out.print("Array before replacement: ");
        replaceArray.printingValuesArray();
        System.out.print("\nArray after replacement: ");
        replaceArray.replacingElementsOddPositions();
        replaceArray.printingValuesArray();

        System.out.print("\n\n############Task6############\n");

        String[] names = new String[]{"Edwards", "Patrick", "Oneill", "Valentine",
                "Costa", "Smith", "Mullins", "Massey"};
        System.out.print("Array before sorting: " + Arrays.toString(names));
        Arrays.sort(names);
        System.out.print("\nArray after sorting: " + Arrays.toString(names));

        System.out.print("\n\n############Task7############\n");

        System.out.print("Array before sorting: ");
        array.printingValuesArray();
        System.out.print("\nArray after sorting: ");
        array.bubbleSort();
        array.printingValuesArray();
    }
}

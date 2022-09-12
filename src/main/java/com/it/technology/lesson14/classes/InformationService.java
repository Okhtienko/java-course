package com.it.technology.lesson14.classes;

import com.it.technology.lesson14.interfaces.Displayable;
import com.it.technology.lesson14.utils.FactorialUtils;
import com.it.technology.lesson14.utils.StringUtils;

public final class InformationService {

    public void display(int key, String string, Integer data) throws IllegalArgumentException {
        switch (key) {
            case 1 -> {
                Displayable<String> displayText = (String text) -> {
                    String reverseText = StringUtils.reverseString(text);
                    return reverseText;
                };
                System.out.println("Reversed " + string + ": " + displayText.displayInformation(string));
            }
            case 2 -> {
                Displayable<Integer> displayNumber = (Integer number) -> {
                    int factorial = FactorialUtils.calculateFactorial(number);
                    return factorial;
                };
                System.out.printf("Factorial of " + data + ": " + displayNumber.displayInformation(data));
            }
            default -> {
                throw new IllegalArgumentException("Illegal key: " + key);
            }
        }
    }
}

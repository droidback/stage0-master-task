package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int third = number % 10;
        number /= 10;
        int second = number % 10;
        number /= 10;
        int first = number;

        int result = third * 100 + second * 10 + first;
        System.out.println(result);
    }

}

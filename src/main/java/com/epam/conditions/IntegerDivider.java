package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {
        if (divider == 0) {
            System.out.println("division by zero");
            return;
        }


        while (dividend >= divider) {
            dividend -= divider;
        }
        boolean result = dividend == 0;
        System.out.println(result ? "can be divided completely" : "cannot be divided completely");
    }

}

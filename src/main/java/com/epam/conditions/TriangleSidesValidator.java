package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        if (firstSide <= 0 || secondSide <= 0 || thirdSide <= 0) {
            System.out.println("it's not a triangle");
            return;
        }

        boolean firstCheck = (firstSide + secondSide) > thirdSide;
        boolean secondCheck = (firstSide + thirdSide) > secondSide;
        boolean thirdCheck = (thirdSide + secondSide) > firstSide;

        boolean result = firstCheck && secondCheck && thirdCheck;
        System.out.println(result ? "this is a valid triangle" : "it's not a triangle");
    }

}

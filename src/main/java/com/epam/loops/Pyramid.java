package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        int count = cathetusLength-1;
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
            count--;
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}

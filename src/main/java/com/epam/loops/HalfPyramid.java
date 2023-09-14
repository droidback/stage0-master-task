package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        int count = cathetusLength-1;
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print('*');
            }
            System.out.println();
            count--;
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}

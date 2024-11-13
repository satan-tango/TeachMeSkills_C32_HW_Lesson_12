package com.varkovich.lesson_12.task_3;

import java.util.Arrays;

/**
 * Повернуть массив из n элементов вправо на k шагов.
 * Например, с n = 7 и k = 3 массив [1,2,3,4,5,6,7] вращается до [5,6,7,1,2,3,4].
 */
public class ApplicationRunner {

    public static void main(String[] args) {
        int n = 10;
        int k = 3;

        int[] numberArray = fillArray(n, 1, 25);
        System.out.println(Arrays.toString(numberArray));

        int[] shiftedArray = arrayShift(numberArray, k);
        System.out.println(Arrays.toString(shiftedArray));
    }

    public static int getRandomNumberInRange(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static int[] fillArray(int length, int min, int max) {
        int[] numberArray = new int[length];
        for (int i = 0; i < length; i++) {
            numberArray[i] = getRandomNumberInRange(min, max);
        }

        return numberArray;
    }

    public static int[] arrayShift(int[] sourceArray, int step) {
        int lastElement;
        for (int i = 0; i < step; i++) {
            lastElement = sourceArray[sourceArray.length - 1];
            for (int j = sourceArray.length - 2; j >= 0; j--) {
                sourceArray[j + 1] = sourceArray[j];
            }
            sourceArray[0] = lastElement;
        }

        return sourceArray;
    }
}

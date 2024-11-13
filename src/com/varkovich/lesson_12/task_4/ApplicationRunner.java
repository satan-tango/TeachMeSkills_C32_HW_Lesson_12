package com.varkovich.lesson_12.task_4;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Дан массив целых чисел, найдите два числа, которые в сумме дают заданное число.
 * Функция twoSum должна возвращать индексы двух чисел так, чтобы они складывались
 * в целевое число.
 * Например:
 * Ввод: числа={2, 7, 11, 15}, цель=9.
 * Выход: индекс1=0, индекс2=1.
 */
public class ApplicationRunner {

    public static void main(String[] args) {
        int desiredNumber = 4;

        int[] arrayNumber = fillArray(10, 1, 10);
        System.out.println(Arrays.toString(arrayNumber));

        Arrays.sort(arrayNumber);
        System.out.println(Arrays.toString(arrayNumber));

        if (arrayNumber[arrayNumber.length - 1] > desiredNumber) {
            arrayNumber = cuttingOffUnnecessaryElements(arrayNumber, desiredNumber);
        }

        System.out.println(Arrays.toString(arrayNumber));

        Map<Integer, Map<Integer, Integer>> resultMap = twoSum(arrayNumber, desiredNumber);
        if (resultMap.isEmpty()) {
            System.out.println("There is no such combination");
            return;
        }

        showMap(resultMap);


    }

    public static Map<Integer, Map<Integer, Integer>> twoSum(int[] array, int desiredNumber) {
        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();
        int counter = 1;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == desiredNumber) {
                    map.put(counter, Map.of(i, j));
                    counter++;
                }
            }
        }

        return map;
    }

    public static void showMap(Map<Integer, Map<Integer, Integer>> map) {
        int firstIndex;
        int secondIndex;
        for (Map.Entry<Integer, Map<Integer, Integer>> item : map.entrySet()) {
            System.out.println(item.getKey() + ":");
            firstIndex = item.getValue().keySet().stream()
                    .findFirst()
                    .get();
            secondIndex = item.getValue().get(firstIndex);
            System.out.println("First index: " + firstIndex);
            System.out.println("Second index: " + secondIndex);
            System.out.println("--------------------------");
        }
    }

    public static int[] cuttingOffUnnecessaryElements(int[] sourceArray, int desiredNumber) {
        int index = sourceArray.length - 1;
        for (int i = sourceArray.length - 1; i >= 0; i--) {
            if (desiredNumber < sourceArray[i]) {
                index--;
            } else {
                break;
            }
        }

        if (index <= 1) {
            throw new IndexOutOfBoundsException();
        }

        int[] cutArray = new int[index + 1];

        for (int i = 0; i < cutArray.length; i++) {
            cutArray[i] = sourceArray[i];
        }

        return cutArray;
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
}

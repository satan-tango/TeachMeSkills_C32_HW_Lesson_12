package com.varkovich.lesson_12.task_1;


import com.varkovich.lesson_12.task_1.validator.HexCodeValidator;

/**
 * Задача 1
 * Написать программу, что переданная строка это hex code для описания цвета.
 * Например, при вводе в программу значения #8b2323, программа должна вернуть - Yes.
 */
public class ApplicationRunner {

    public static void main(String[] args) {
        String firstLine = "#8B2323";
        String secondLine = "#8b23%%";

        System.out.println(HexCodeValidator.isValidHexCode(firstLine) ? "YES" : "NO");
        System.out.println(HexCodeValidator.isValidHexCode(secondLine) ? "YES" : "NO");
    }
}

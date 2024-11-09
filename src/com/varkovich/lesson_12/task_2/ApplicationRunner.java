package com.varkovich.lesson_12.task_2;


import com.varkovich.lesson_12.task_2.validator.LinkValidator;

/**
 * Написать программу, которая будет проверять, что введенная ссылка валидная.
 * Например, при анализе вот такой ссылки https://teachmeskills.by/kursy/programmirovaniya-online
 * - программа должна вернуть, что ссылка валидна. А при вводе tcp://teachmeskills.by/kursy/programmirovaniya-online
 * - программа должна вернуть, что ссылка не валидна (ссылка начинается ни с http, ни с https)
 */
public class ApplicationRunner {

    public static void main(String[] args) {
        String firstLine = "https://teachmeskills.by/kursy/programmirovaniya-online";
        String secondLine = "tcp://teachmeskills.by/kursy/programmirovaniya-online";

        System.out.println(LinkValidator.isValidLink(firstLine) ? "Link is valid" : "Link is not valid");
        System.out.println(LinkValidator.isValidLink(secondLine) ? "Link is valid" : "Link is not valid");
    }
}

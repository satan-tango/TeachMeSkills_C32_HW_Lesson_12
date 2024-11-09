package com.varkovich.lesson_12.task_2.validator;

import com.varkovich.lesson_12.task_2.consts.Constants;

public class LinkValidator {

    public static boolean isValidLink(String line) {
        return line.matches(Constants.LINK_REGEXP);
    }
}

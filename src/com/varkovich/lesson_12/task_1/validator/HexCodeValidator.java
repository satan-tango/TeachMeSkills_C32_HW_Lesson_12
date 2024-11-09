package com.varkovich.lesson_12.task_1.validator;

import com.varkovich.lesson_12.task_1.consts.Constants;

public class HexCodeValidator {

    public static boolean isValidHexCode(String line) {
        return line.matches(Constants.HEX_CODE_REGEXP);
    }
}

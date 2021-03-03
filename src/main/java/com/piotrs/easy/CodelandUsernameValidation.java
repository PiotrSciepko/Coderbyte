package com.piotrs.easy;

/*
Have the function CodelandUsernameValidation(str) take the str parameter being passed and determine if the string
is a valid username according to the following rules:
        1. The username is between 4 and 25 characters.
        2. It must start with a letter.
        3. It can only contain letters, numbers, and the underscore character.
        4. It cannot end with an underscore character.
If the username is valid then your program should return the string true, otherwise return the string false.
Input: "aa_"
Output: false
Input: "u__hello_world123"
Output: true
*/

public class CodelandUsernameValidation {

    private static final String STR = "u__hello_world123";

    public static void main(String[] args) {

        String result = "false";
        if (STR.matches("^[A-Za-z]{1}[A-Za-z0-9_]{2,23}[A-Za-z0-9]{1}$")) {
            result = "true";
        }
        System.out.println(result);
    }
}

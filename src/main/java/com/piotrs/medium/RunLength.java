package com.piotrs.medium;

//Difficulty: Medium
//Have the function RunLength(str) take the str parameter being passed and return a compressed version of the string
//        using the Run-length encoding algorithm. This algorithm works by taking the occurrence of each repeating
//        character and outputting that number along with a single character of the repeating sequence.
//        For example: "wwwggopp" would return 3w2g1o2p. The string will not contain any numbers, punctuation, or symbols.

public class RunLength {

    private static final String STR = "wwwppoqq";

    public static void main(String[] args) {

        int i = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(STR).append(' ');
        StringBuilder result = new StringBuilder();
        while (sb.charAt(i) != ' ') {
            int counter = 0;
            char controlChar = sb.charAt(i);
            while (sb.charAt(i) == controlChar) {
                counter += 1;
                i += 1;
            }
            result.append(counter).append(controlChar);
        }
        System.out.println(result.toString());
    }
}

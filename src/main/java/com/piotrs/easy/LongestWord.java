package com.piotrs.easy;

/*
Difficulty: easy
Have the function LongestWord(sen) take the sen parameter being passed and return the largest word in the string.
If there are two or more words that are the same length, return the first word from the string with that length.
Ignore punctuation and assume sen will not be empty.
Input:"fun&!! time"
Output:"time"
Input:"I love dogs"
Output:"love"
*/

import java.util.Arrays;

public class LongestWord {

    private static final String SEN = "I love dogs";

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < SEN.length(); i++) {
            char ch = SEN.charAt(i);
            if (Character.isLetter(ch)) {
                sb.append(ch);
            } else {
                sb.append(" ");
            }
        }
        String[] splitted = sb.toString().split(" ");
        int longest = 0;
        int longestIndex = 0;
        for (String s : splitted) {
            if (s.length() > longest) {
                longest = s.length();
                longestIndex = Arrays.asList(splitted).indexOf(s);
            }
        }
        System.out.println(splitted[longestIndex]);
    }
}


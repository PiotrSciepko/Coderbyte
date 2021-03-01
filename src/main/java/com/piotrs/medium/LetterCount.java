package com.piotrs.medium;

/*
Have the function LetterCount(str) take the str parameter being passed and return the first word with the greatest
number of repeated letters. For example: "Today, is the greatest day ever!" should return greatest because it has
2 e's (and 2 t's) and it comes before ever which also has 2 e's. If there are no words with repeating letters return -1.
Words will be separated by spaces.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LetterCount {

    private static final String STR = "Today, is the greatest day ever!";

    private static int countLetters(String str) {
        List<Integer> quantities = new ArrayList<>();
        for (char i = 'a'; i <= 'z'; i++) {
            char finalI = i;
            int count = (int) str.chars().filter(el -> el == finalI).count();
            quantities.add(count);
        }
        return Collections.max(quantities);
    }

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < STR.length(); i++) {
            if (Character.isLetter(STR.charAt(i)) || STR.charAt(i) == ' ') {
                sb.append(STR.charAt(i));
            }
        }
        String[] splitted = sb.toString().split(" ");
        Integer[] repeatedLetters = new Integer[splitted.length];
        for (String s : splitted) {
            repeatedLetters[Arrays.asList(splitted).indexOf(s)] = countLetters(s);
        }
        int maxValue = Collections.max(Arrays.asList(repeatedLetters));
        int maxIndex = Arrays.asList(repeatedLetters).indexOf(maxValue);

        if (maxValue != 1) {
            System.out.println(splitted[maxIndex]);
        } else {
            System.out.println(-1);
        }


    }
}

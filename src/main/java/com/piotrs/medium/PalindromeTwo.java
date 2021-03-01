package com.piotrs.medium;

/*
Have the function PalindromeTwo(str) take the str parameter being passed and return the string true if the parameter
 is a palindrome, (the string is the same forward as it is backward) otherwise return the string false.
 The parameter entered may have punctuation and symbols but they should not affect whether the string is
 in fact a palindrome. For example: "Anne, I vote more cars race Rome-to-Vienna" should return true.
*/

public class PalindromeTwo {

    private static final String STR = "Anne, I vote more cars race Rome-to-Vienna";

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < STR.length(); i++) {
            if (Character.isLetter(STR.charAt(i))) {
                sb.append(STR.charAt(i));
            }
        }
        String firstHalf = sb.substring(0, sb.length() / 2).toLowerCase();
        String secondHalf = sb.reverse().substring(0, sb.length() /2).toLowerCase();

        if (firstHalf.equals(secondHalf)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

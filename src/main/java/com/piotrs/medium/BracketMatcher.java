package com.piotrs.medium;

/*
Have the function BracketMatcher(str) take the str parameter being passed and return 1 if the brackets are correctly
matched and each one is accounted for. Otherwise return 0. For example: if str is "(hello (world))", then the output
should be 1, but if str is "((hello (world))" the the output should be 0 because the brackets do not correctly match up.
Only "(" and ")" will be used as brackets. If str contains no brackets return 1.
Input: "(coder)(byte))"
Output: 0
Input: "(c(oder)) b(yte)"
Output: 1
*/

public class BracketMatcher {

    private static final String STR = "(coder)(byte))";

    public static void main(String[] args) {

        String bracketStr = STR.replaceAll("[^()]", "");
        int bracketCount = 0;
        for (int i = 0; i < bracketStr.length(); i++) {
            if (bracketCount >= 0) {
                bracketCount += bracketStr.charAt(i) == '(' ? 1 : -1;
            } else {
                break;
            }
        }
        System.out.println(bracketCount == 0 ? 1 : 0);
    }
}

package com.piotrs;

public class SimpleCode {

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

package com.piotrs;

public class SimpleCode {

    private static final String STR = "wwwppoqq";

    public static void main(String[] args) {

        int i = 0;
        char controlChar = STR.charAt(0);
        StringBuilder sb = new StringBuilder();
        while (i < STR.length() - 1) {
            int counter = 0;
            controlChar = STR.charAt(i);
            while (STR.charAt(i) == controlChar) {
                counter += 1;
                if (i < STR.length() - 1) {
                    i += 1;
                } else {
                    break;
                }
            }
            sb.append(counter).append(controlChar);
        }
        if (STR.length() > 1) {
            System.out.println(sb.toString());
        } else {
            System.out.println("1" + controlChar);
        }
    }
}

package com.piotrs.easy;

/*
Have the function FindIntersection(strArr) read the array of strings stored in strArr which will contain 2 elements:
the first element will represent a list of comma-separated numbers sorted in ascending order, the second element will
represent a second list of comma-separated numbers (also sorted). Your goal is to return a comma-separated string
containing the numbers that occur in elements of strArr in sorted order. If there is no intersection,
return the string false.
Input: new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"}
Output: 1,4,13
Input: new String[] {"1, 3, 9, 10, 17, 18", "1, 4, 9, 10"}
Output: 1,9,10
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersection {

    private static final String[] strArr = new String[]{"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};

    public static void main(String[] args) {

        String[] arr1 = strArr[0].replace(" ", "").split(",");
        List<String> arr2 = Arrays.asList(strArr[1].replace(" ", "").split(","));
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (String number : arr1) {
            if (arr2.contains(number)) {
                result.add(number);
            }
        }

        if (!result.isEmpty()) {
            for (String number : result) {
                sb.append(number).append(",");
            }
            sb.deleteCharAt(sb.length() - 1);
            strArr[0] = sb.toString();
            System.out.println(strArr[0]);
        } else {
            System.out.println("false");
        }
    }
}

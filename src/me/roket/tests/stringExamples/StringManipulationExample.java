package me.roket.tests.stringExamples;

import java.util.Arrays;

public class StringManipulationExample {
    public static void main(String[] args){
        String strVoidLeft = "hello, world!     ";
        String strVoidRight = "     hello, world!";

        // .trim()은 문자열 양 옆의 공백을 제거할 때 사용한다.
        String strTrim = strVoidLeft.trim();
        String strTrim02 = strVoidRight.trim();
        System.out.println(strTrim);
        System.out.println(strTrim02);

        // .substring()은 문자열의 특정 부분을 추출할 때 사용한다.
        String strSubstr = strTrim.substring(1, 2);
        System.out.println(strSubstr);

        // .replace()는 특정 문자를 다른 문자로 바꿀 때 사용한다.
        String strReplace = strTrim.replace("l", "o");
        System.out.println(strReplace);

        // .replaceAll()은 특정 문자열을 다른 문자열로 바꿀 때 사용한다.
        String strReplaceAll = strTrim.replaceAll("hello", "java");
        System.out.println(strReplaceAll);

        // .split()은 해당 구분자를 기준으로 문자열을 나눌 때 사용한다.
        String[] arraySplit = strTrim.split(",");
        System.out.println(Arrays.toString(arraySplit));

        char[] carr = strTrim.toCharArray();
        System.out.println(Arrays.toString(carr));
    }
}

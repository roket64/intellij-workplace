package me.roket.tests.stringExamples;

import java.util.StringJoiner;

public class SeperatorExample {
    public static void main(String[] args){
        final String seperator = ",";

        // for문을 사용하여 구분자를 넣는 예제는 다음과 같다.
        String[] arr = {"first", "second", "third"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++){
            sb.append(arr[i]);
            if (i < arr.length - 1){
                sb.append(seperator);
            }
        }
        System.out.println(sb.toString());

        // join()을 사용하여 구분자를 넣는 예제는 다음과 같다.
        String[] arr02 = {"first", "second", "third"};
        String str = String.join(seperator, arr02);
        System.out.println(str);

        // joiner()를 사용하여 구분자를 넣는 예제는 다음과 같다.
        String[] arr03 = {"first", "second", "third"};
        StringJoiner sj = new StringJoiner(seperator);
        for (String s: arr03){
            sj.add(s);
        }
        System.out.println(sj.toString());
    }
}

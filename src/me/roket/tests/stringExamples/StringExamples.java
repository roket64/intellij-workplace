package me.roket.tests.stringExamples;

public class StringExamples {
    public static void main(String[] args) {
        // String 클래스는 불변(immutable)클래스다.
        // 이는 인스턴스가 생성되면, 그 값을 읽기만 할 수 있고 변경할 수는 없다는 뜻이다.

        // 아래의 string2는 이미 "hello" 값을 가지는 인스턴스가 존재하므로, 새로운 객체를 생성하지 않고 string1의 변수 주소가 할당된다.
        String string1 = "hello";
        String string2 = "hello";
        System.out.println(String.format("%s,%s", string1.hashCode(), string2.hashCode()));
        System.out.println(string1 == string2); // true
        System.out.println(string1.equals(string2)); // true

        System.out.println("");
        // 그러나 아래의 string4는 새로운 객체를 생성하지 않고 string3의 변수 주소는 할당되지 않는다.
        String string3 = new String("world");
        String string4 = "world";
        System.out.println(String.format("%s,%s", string3.hashCode(), string4.hashCode()));
        System.out.println(string3 == string4); // false
        System.out.println(string3.equals(string4)); //true

        // 이때, 위 연산에서 ==는 문자열을 비교하는 것이 아닌 변수의 주소값을 비교한다.
        // 또한, .hashCode() 메서드는 문자열 내용에 기반해 할당되는 유일한 코드값이다.
    }
}

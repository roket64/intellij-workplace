package me.roket.tests.genericExamples;

public class GenericExamMain {
    public static void main(String[] args) {
        GenericExam01 exam01 = new GenericExam01();
        exam01.setObj(new Object());
        Object obj01 = exam01.getObj();

        exam01.setObj("hello, world!");
        String stringObj = (String) exam01.getObj();
        System.out.println(stringObj);

        exam01.setObj(1);
        int intObj = (Integer) exam01.getObj();
        System.out.println(intObj);
        //기존에는 따로 형변환을 해야 했다.

        GenericExam02<Object> examObject = new GenericExam02<Object>();
        examObject.setObject(new Object());
        Object obj02 = examObject.getObject();

        GenericExam02<String> examString = new GenericExam02<>();
        examString.setObject("hello, world!");
        String stringObj02 = examString.getObject();
        System.out.println(stringObj02);

        GenericExam02<Integer> examInteger = new GenericExam02<>();
        examInteger.setObject(1);
        Integer integerObj02 = examInteger.getObject();
        System.out.println(integerObj02);
        //Generic을 사용함으로써 미리 타입을 지정할 수 있게 되었다.
    }
}

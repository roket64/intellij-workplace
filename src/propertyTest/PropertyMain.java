package propertyTest;

public class PropertyMain {
    public static void main(String[] args) {
        String testKeyName = "testKeyName";
        String testKeyName02 = "testKeyName02";
        String testValue = "testValue";
        String testValue02 = "testValue02";
        PropertyTest test = new PropertyTest(testKeyName, testValue);
        PropertyTest test02 = new PropertyTest(testKeyName02, testValue02);
        String returnValue;
        String returnValue02;

        test.setFilePath();
        returnValue = test.getProperty();

        test02.setFilePath();
        returnValue02 = test02.getProperty();

        System.out.println(returnValue);
        System.out.println(returnValue02);
    }
}

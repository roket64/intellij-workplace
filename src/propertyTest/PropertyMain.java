package propertyTest;

public class PropertyMain {
    public static void main(String[] args) {
        String testKeyName = "testKeyName";
        String testValue = "testValue";
        PropertyTest test = new PropertyTest(testKeyName, testValue);
        String returnValue;

        test.setFilePath();
        returnValue = test.getProperty();

        System.out.println(returnValue);
    }
}

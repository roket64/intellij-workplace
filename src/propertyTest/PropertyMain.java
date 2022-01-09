package propertyTest;

public class PropertyMain {
    public static void main(String[] args) {
        String testkeyName = "testKeyName";
        String testValue = "testValue";
        String testConfigFilePath = "src/propertyTest/config.properties";
        PropertyTest test = new PropertyTest(testkeyName, testValue,testConfigFilePath);
        String returnValue;

        test.setFilePath();
        test.setProperty();
        returnValue = test.getProperty();
        System.out.println(returnValue);
    }
}

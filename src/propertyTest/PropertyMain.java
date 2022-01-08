package propertyTest;

public class PropertyMain {
    public static void main(String[] args) {
        String testkeyName = "testKeyName";
        String testValue = "testValue";
        String testConfigFilePath = "src/propertyTest/config.properties";
        PropertyTest test = new PropertyTest(testkeyName, testValue,testConfigFilePath);
        String returnValue;

        if (test.createFile()){
            if (test.setProperty()){
                returnValue = test.getProperty();
                System.out.println(returnValue);
            }else{
                try {
                    throw new Exception();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }else if (!test.createFile()){
            test.createFile();
            test.setProperty();
            returnValue = test.getProperty();
            System.out.println(returnValue);
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

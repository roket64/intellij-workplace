package propertyTest;

import java.io.*;
import java.util.Properties;

public class PropertyTest {
    private String keyName;
    private String keyValue;
    private File configFile;
    private static final String configFilePath = "src/propertyTest/config.properties";

    public PropertyTest(String keyName, String keyValue){
        this.keyName = keyName;
        this.keyValue = keyValue;
        this.configFile = new File(configFilePath);
    }

    public void setFilePath(){
        if (configFile.exists() || configFile.isFile()){
            setProperty();
        }else{
            try {
                FileOutputStream fos = new FileOutputStream(configFile, true);
                setProperty();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void setProperty(){
        try {
            FileWriter fw = new FileWriter(configFile);
            BufferedWriter bw = new BufferedWriter(fw);
            String twinValue = keyName + "=" + keyValue + "\n";

            bw.write(twinValue);
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getProperty(){
        try{
            FileReader fr = new FileReader(configFile);
            Properties properties = new Properties();
            properties.load(fr);
            return properties.getProperty(keyName);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
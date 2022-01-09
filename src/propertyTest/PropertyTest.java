package propertyTest;

import java.io.*;
import java.util.Properties;

public class PropertyTest {
    String keyName;
    String keyValue;
    String configFilePath;
    File configFile;

    public PropertyTest(String keyName, String keyValue, String configFilePath){
        this.keyName = keyName;
        this.keyValue = keyValue;
        this.configFilePath = configFilePath;
        this.configFile = new File(configFilePath);
    }

    public void setFilePath(){
        if (configFile.exists() || configFile.isFile()){
            return;
        }else{
            try {
                FileOutputStream fos = new FileOutputStream(configFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean setProperty(){
        try {
            FileWriter fw = new FileWriter(configFile);
            BufferedWriter bw = new BufferedWriter(fw);
            String twinValue = keyName + "=" + keyValue;

            bw.write(twinValue);
            bw.flush();
            bw.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
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
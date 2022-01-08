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
    }

    public boolean createFile(){
        configFile = new File(configFilePath);
        if (!configFile.exists() && !configFile.isFile()){
            try {
                FileOutputStream fo = new FileOutputStream(configFilePath);
                return true;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return false;
            }
        }else if (configFile.exists() || configFile.isFile()){
            return true;
        }else{
            return false;
        }
    }

    public boolean setProperty(){
        try {
            FileWriter fw = new FileWriter(configFilePath);
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
            FileReader fr = new FileReader(configFilePath);
            Properties properties = new Properties();
            properties.load(fr);
            return properties.getProperty(keyName);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
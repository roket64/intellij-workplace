package me.roket.tests.propertyTest;

import java.io.*;
import java.util.Properties;

public class PropertyTest {
    private String keyName;
    private String keyValue;
    private File configFile;
    private static final String configFilePath = "src/me/roket/tests/propertyTest/config.properties";

    public PropertyTest(String keyName, String keyValue){
        this.keyName = keyName;
        this.keyValue = keyValue;
        this.configFile = new File(configFilePath);
    }

//    public void setFilePath(){
//        if (configFile.exists() || configFile.isFile()){
//            return;
//        }else{
//            try {
//                FileOutputStream fos = new FileOutputStream(configFile, false);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }

//    public void setProperty(){
//        Properties properties = new Properties();
//        try {
//            FileInputStream fos = new FileInputStream(configFile);
//            properties.setProperty(keyName, keyValue);
//            properties.put(keyName, keyValue);
//            fos.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    public void setProperty(){
        try{
            Properties properties = new Properties();
            OutputStream out = new FileOutputStream(configFile);

            properties.put(keyName, keyValue);
            properties.store(out, null);
            out.close();
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
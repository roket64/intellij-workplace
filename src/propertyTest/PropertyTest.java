package propertyTest;

import java.io.*;
import java.util.HashMap;
import java.util.Properties;

public class PropertyTest {
    private String keyName;
    private String keyValue;
    private File configFile;
    //프로퍼티 파일의 경로를 미리 정해주었으나 필요에 따라 바뀔 수도 있음
    private static final String configFilePath = "src/propertyTest/config.properties";

    public PropertyTest(String keyName, String keyValue){
        this.keyName = keyName;
        this.keyValue = keyValue;
        this.configFile = new File(configFilePath);
    }

    public void setFilePath(){
        //프로퍼티 파일이 존재하는지, 존재한다면 파일인지 여부 확인.
        if (configFile.exists() || configFile.isFile()){
            //조건에 부합하면 프로퍼티 값 설정.
            setProperty();
        }else{
            try {
                //부합하지 않으면 새로운 파일 생성.
                FileOutputStream fos = new FileOutputStream(configFile, true);
                //파일 생성 후 프로퍼티 값 설정.
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
            /* 매개변수로 받아온 문자열을 조합해 저장한다.
            hashMap이나 배열을 이용할 수도 있을 것 같다.*/
            String twinValue = keyName + "=" + keyValue + "\n";
            /*
            //TODO
            새로운 key값이 입력되면 기존의 key에 덮어쓰는 문제가 있다.
            고치려면 어떻게 해야할까
             */
            HashMap<String, String> twins = new HashMap<>();
            twins.put(keyName, keyValue);
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
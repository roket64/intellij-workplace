package fileCopyTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyTest {
    public String targetPluginPath;
    public String pluginDirPath;
    public String targetPluginCopy;

    public FileCopyTest(String targetPluginPath, String pluginDirPath, String targetPluginCopy) {
        this.targetPluginPath = targetPluginPath;
        this.pluginDirPath = pluginDirPath;
        this.targetPluginCopy = targetPluginCopy;
    }

    public boolean copy() {
        File targetPlugin = new File(targetPluginPath);
        File pluginCopy = new File(targetPluginCopy);

        try {
            FileInputStream inputFile = new FileInputStream(targetPlugin);
            FileOutputStream outputFile = new FileOutputStream(pluginCopy);

            int fileList;
            while ((fileList = inputFile.read()) != -1){
                outputFile.write(fileList);
            }
            try {
                inputFile.close();
                outputFile.close();
            } catch (Exception e){
                return false;
            }
            return true;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}

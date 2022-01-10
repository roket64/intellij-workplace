package me.roket.tests.fileCopyExamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyTest {
    private final String targetPluginFile;
    private final String targetPluginCopy;

    public FileCopyTest(String targetPluginFile, String pluginDirPath, String targetPluginCopy) {
        this.targetPluginFile = targetPluginFile;
        this.targetPluginCopy = targetPluginCopy;
    }

    public boolean copy() {
        File targetPlugin = new File(targetPluginFile);
        File pluginCopy = new File(targetPluginCopy);

        try {
            FileInputStream inputFile = new FileInputStream(targetPlugin);
            FileOutputStream outputFile = new FileOutputStream(pluginCopy);

            int fileList;
            while ((fileList = inputFile.read()) != -1){
                outputFile.write(fileList);
            }
            try {
                if (inputFile != null || outputFile != null){
                    try {
                        inputFile.close();
                        outputFile.close();
                        return true;
                    } catch (Exception e) {
                        e.printStackTrace();
                        return false;
                    }
                }
            } catch (Exception e){
                e.printStackTrace();
                return false;
            }
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return false;
    }
}

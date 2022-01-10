package me.roket.tests.fileCopyExamples;

public class FileCopyMain {
    public static void main(String[] args){
        String targetPluginFile = "C:/Users/Jaeseok Lee/IdeaProjects/MCPlugins/target/roketPlugin-1.0-SNAPSHOT.jar";
        String pluginDirPath = "C:/Users/Jaeseok Lee/Desktop/server/plugins/";
        String targetPluginCopy = pluginDirPath + "roketPlugin-1.0-SNAPSHOT.jar";

        FileCopyTest runCopy = new FileCopyTest(targetPluginFile, pluginDirPath, targetPluginCopy);
        boolean returnInfo = runCopy.copy();

        if (!returnInfo) {
            System.out.println("Something went wrong...");
        } else if (returnInfo){
            System.out.println("Everything fine.");
        }
    }
}

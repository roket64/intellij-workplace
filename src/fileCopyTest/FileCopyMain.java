package fileCopyTest;

public class FileCopyMain {
    public static void main(String[] args){
        String targetPluginPath = "C:/Users/Jaeseok Lee/IdeaProjects/MCPlugins/target/roketPlugin-1.0-SNAPSHOT.jar";
        String pluginDirPath = "C:/Users/Jaeseok Lee/Desktop/server/plugins/";
        String targetPluginCopy = pluginDirPath + "roketPlugin-1.0-SNAPSHOT.jar";

        FileCopyTest runCopy = new FileCopyTest(targetPluginPath, pluginDirPath, targetPluginCopy);
        int cRETURN = runCopy.copy();

        if (cRETURN == -1) {
            System.out.println("Something went wrong...");
        } else if (cRETURN == 0){
            System.out.println("Everything fine.");
        }
    }
}

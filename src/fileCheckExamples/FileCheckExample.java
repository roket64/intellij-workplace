package fileCheckExamples;

import java.io.File;

public class FileCheckExample {

    public static void main(String[] args) {
        File file = new File("src/fileCheckExamples/testFiles/");
        File[] txtList = file.listFiles();

        for (int i = 0; i < txtList.length; i++) {
            System.out.println("객체: " + txtList[i]);

            if(txtList[i].exists()) {
                System.out.println("해당 객체가 존재합니다.");
            } else
                System.out.println("해당 객체가 존재하지 않습니다." );

            if(txtList[i].isFile()) {
                System.out.println("해당 객체는 파일입니다." );
            } else
                System.out.println("해당 객체는 파일이 아닙니다." );

            if(txtList[i].isDirectory()) {
                System.out.println("해당 객체는 폴더입니다." );
            } else
                System.out.println("해당 객체는 폴더가 아닙니다" );
            System.out.println("===========================================" );
        }
    }
}
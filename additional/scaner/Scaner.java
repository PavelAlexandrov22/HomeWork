package additional.scaner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Scaner {
    public static void main(String[] args) {
        ArrayList<File> fileList = new ArrayList<>();
        directory(new File("C\\"), fileList);
        for(File file : fileList){
            System.out.println(file.getAbsolutePath());
        }

    }

    private static void  directory(File rootFile, List<File> fileList) {
        if(rootFile.isDirectory()){
            File[] directoryFiles = rootFile.listFiles();
            if(directoryFiles != null){
                for(File file : directoryFiles){
                    if(file.getName().toLowerCase().endsWith(".txt")){
                        fileList.add(file);

                    }
                }
            }
        }



    }



}

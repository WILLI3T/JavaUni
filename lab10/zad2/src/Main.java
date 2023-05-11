import java.io.File;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File dir = new File("basedir");
        String biggestDir="";
        int mostFiles = 0;

        List<File> filesInDir = Arrays.asList(dir.listFiles());
        for (File file:filesInDir) {

           if(file.isDirectory()){
               List<File> fileList = Arrays.asList(file.listFiles());
               if(mostFiles<fileList.size()){

                   biggestDir = file.getName();
                   mostFiles = fileList.size();
               }
            }
        }
        System.out.println(biggestDir);
    }
}
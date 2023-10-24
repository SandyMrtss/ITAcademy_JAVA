package n2exercici1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WriteTreeDirParam {
    public WriteTreeDirParam(){
        super();
    }

    public static void writeTreeTxt(String outputPath, String fileName, String dirPath){
        try {
            outputPath = outputPath + "\\" + fileName;
            WriterTreeDirTxtParam writef = new WriterTreeDirTxtParam(outputPath);
            Files.walkFileTree(Paths.get(dirPath), writef);
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

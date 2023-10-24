package n1.n1exercici3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteTreeDir {
    public WriteTreeDir(){
        super();
    }

    public static void writeTreeTxt(Path path){
        try {
            WriterTreeDirTxt writef = new WriterTreeDirTxt();
            Files.walkFileTree(path, writef);
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

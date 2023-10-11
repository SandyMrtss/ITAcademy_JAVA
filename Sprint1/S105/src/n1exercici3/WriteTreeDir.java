package n1exercici3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteTreeDir {
    public WriteTreeDir(){
        super();
    }

    static void writeTreeTxt(Path path){
        try {
            Path startingDir = path;
            WriterTreeDirTxt writef = new WriterTreeDirTxt();
            Files.walkFileTree(startingDir, writef);
        }
        catch (IOException ex) {
            System.out.println(ex);
        }
    }
}

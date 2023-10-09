package n1exercici2;
import n1exercici1.listDirContent;

import java.io.IOException;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;

public class ListTreeDir extends listDirContent{
    public ListTreeDir(){
        super();
    }

    static void listTree(Path dir){
        try {
            Path startingDir = dir;
            listDirContent printf = new listDirContent();
            Files.walkFileTree(startingDir, printf);
        }
        catch (IOException ex) {
            System.out.println(ex);
        }
    }
}

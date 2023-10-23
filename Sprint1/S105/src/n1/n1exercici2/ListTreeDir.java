package n1.n1exercici2;
import n1.n1exercici1.myFileVisitor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ListTreeDir extends myFileVisitor {
    public ListTreeDir(){
        super();
    }

    public static void main(String[] args){
        if(args.length > 0){
            try {
                String startingDir = args[0];
                Path startingDirPath = Paths.get(startingDir);
                myFileVisitor printf = new myFileVisitor();
                Files.walkFileTree(startingDirPath, printf);
            }
            catch (IOException ex) {
                System.out.println(ex);
            }
        }
        else {
            System.out.println("Please write the desired directory's path");
        }
    }
}

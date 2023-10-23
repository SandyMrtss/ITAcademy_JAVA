package n1.n1exercici1;
import java.nio.file.*;

public class ListDirContent{
    public static void main(String[] args) {
        if (args.length > 0){
            String dir = args[0];
            Path dirPath = Paths.get(dir);
            myFileVisitor.listDirectory(dirPath);
        }
        else{
            System.out.println("Please write the desired directory's path");
        }
    }

}

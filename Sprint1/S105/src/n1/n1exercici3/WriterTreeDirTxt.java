package n1.n1exercici3;

import java.io.*;
import java.nio.file.*;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.*;

import static java.nio.file.FileVisitResult.CONTINUE;
import static java.nio.file.Files.getLastModifiedTime;

public class WriterTreeDirTxt extends SimpleFileVisitor <Path>{
    private File output = new File("Sprint1/S105/src/n1/directoryTree.txt");
    private FileWriter myWriter = new FileWriter(output, true);

    public WriterTreeDirTxt() throws IOException {
        super();
    }

    public void setOutput(File output) {
        this.output = output;
    }

    public void setMyWriter(FileWriter myWriter) {
        this.myWriter = myWriter;
    }

    @Override
    public FileVisitResult visitFile(Path dir, BasicFileAttributes attr) throws IOException {
        FileTime lastModified = getLastModifiedTime(dir);
        if (attr.isDirectory()) {
            myWriter.write("(D)" + dir + "Last updated on " + lastModified.toString() + "\n");
        } else if (attr.isRegularFile()) {
            myWriter.write("(F)" + dir + "Last updated on " + lastModified.toString() + "\n");        }
        return CONTINUE;
    }
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attr) throws IOException {
        FileTime lastModified = getLastModifiedTime(dir);
        myWriter.write("(D)" + dir + "Last updated on " + lastModified.toString() + "\n");
        return CONTINUE;
    }

}

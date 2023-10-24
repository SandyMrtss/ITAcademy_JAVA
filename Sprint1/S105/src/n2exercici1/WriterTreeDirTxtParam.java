package n2exercici1;

import java.io.*;
import java.nio.file.*;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.*;

import static java.nio.file.FileVisitResult.CONTINUE;
import static java.nio.file.Files.getLastModifiedTime;

public class WriterTreeDirTxtParam extends SimpleFileVisitor<Path> {
    private File output;
    private FileWriter myWriter;

    public WriterTreeDirTxtParam(String filePath) throws IOException {
        super();
        this.output = new File(filePath);
        output.createNewFile();
        this.myWriter = new FileWriter(output, true);
    }

    @Override
    public FileVisitResult visitFile(Path dir, BasicFileAttributes attr) throws IOException {
        String lastModified = getLastModifiedTime(dir).toString();
        lastModified = lastModified.substring(0, lastModified.length() - 9);
        if (attr.isDirectory()) {
            myWriter.write("(D) " + dir + " Last updated on " + lastModified + "\n");
        } else if (attr.isRegularFile()) {
            myWriter.write("(F) " + dir + " Last updated on " + lastModified + "\n");        }
        return CONTINUE;
    }
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attr) throws IOException {
        String lastModified = getLastModifiedTime(dir).toString();
        lastModified = lastModified.substring(0, lastModified.length() - 9);
        myWriter.write("(D) " + dir + " Last updated on " + lastModified + "\n");
        return CONTINUE;
    }

}

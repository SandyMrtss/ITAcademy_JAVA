package n1exercici1;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.*;
import static java.nio.file.FileVisitResult.*;
import static java.nio.file.Files.*;


public class myFileVisitor extends SimpleFileVisitor<Path> {
    public myFileVisitor() {
        super();
    }

    static void listDirectory(Path dir) {
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
            for (Path file : stream) {
                System.out.println(file.getFileName());
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public FileVisitResult visitFile(Path dir, BasicFileAttributes attr) throws IOException {
        FileTime lastModified = getLastModifiedTime(dir);
        if (attr.isDirectory()) {
            System.out.printf("(D) %s Last updated on %.16s\n", dir, lastModified);
        } else if (attr.isRegularFile()) {
            System.out.printf("(F) %s Last updated on %.16s\n", dir, lastModified);
        }
        return CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attr) throws IOException {
        FileTime lastModified = getLastModifiedTime(dir);
        System.out.printf("(D) %s Last updated on %.16s\n", dir, lastModified);
        return CONTINUE;
    }
}

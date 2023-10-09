package n1exercici2;

import java.nio.file.*;

public class Main {
    public static void main(String[] args) {
        Path dir = Paths.get("").toAbsolutePath();
        ListTreeDir.listTree(dir);
    }
}

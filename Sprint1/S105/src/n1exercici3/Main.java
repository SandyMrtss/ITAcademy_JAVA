package n1exercici3;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path dir = Paths.get("").toAbsolutePath();
        WriteTreeDir.writeTreeTxt(dir);
    }
}

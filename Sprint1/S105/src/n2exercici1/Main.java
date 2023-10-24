package n2exercici1;

import n1.n1exercici3.*;
import java.io.*;
import java.nio.file.*;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(new File("configuration.properties")));
            File output = new File((String) properties.get("DIRECTORY_WRITE") + properties.get("TXT_NAME"));
            WriterTreeDirTxt.setOutput(output);
            Path path = Paths.get((String) properties.get("DIRECTORY_READ"));
            WriteTreeDir.writeTreeTxt(path);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

package n2exercici1;

import java.io.*;
import java.util.Properties;

public class Main {
    private static String getProperties(){
        String configPath = Main.class.getResource("configuration.properties").toString();
        configPath = configPath.replace("file:/", "");
        return configPath;
    }
    public static void main(String[] args) {

        String configPath = getProperties();
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(configPath));
            String outputPath = (String) properties.get("DIRECTORY_WRITE");
            String fileName = (String) properties.get("TXT_NAME");
            String dirPath = (String) properties.get("DIRECTORY_READ");
            WriteTreeDirParam.writeTreeTxt(outputPath, fileName, dirPath);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

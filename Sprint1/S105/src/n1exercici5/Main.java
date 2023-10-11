package n1exercici5;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        MyFile myFile = new MyFile("ITAcademy_JAVA\\Sprint1\\S103\\src\\n1exercici3\\countries.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(myFile);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(new MyFile(myFile));
        objectOutputStream.flush();
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream(myFile);
    }
}

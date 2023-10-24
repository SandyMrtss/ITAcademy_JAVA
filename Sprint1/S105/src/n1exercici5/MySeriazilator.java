package n1exercici5;

import java.io.*;

public class MySeriazilator{
    private static final long serialVersionUID = 1L;

    public MySeriazilator(String path){
    }

    public static void serialize(Object obj, String fileName) throws IOException{
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);
        fos.close();
    }
    public static Object deserialize(String fileName) throws IOException, ClassNotFoundException{
        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object obj = ois.readObject();
        ois.close();
        return obj;
    }

}

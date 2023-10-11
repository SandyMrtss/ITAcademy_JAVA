package n1exercici5;

import java.io.File;
import java.io.Serializable;

public class MyFile implements Serializable {
    private static final long serialVersionUID = 1L;
    private File file;

    public MyFile(String fileName){
        this.file = new File(fileName);
    }


}

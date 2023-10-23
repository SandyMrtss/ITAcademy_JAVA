package n1.n1exercici4;
import java.io.*;

public class WriteFIleInConsole {

    public static void writeInConsole(String fileName){
        BufferedReader br = null;
        PrintWriter pw = new PrintWriter(System.out, true);
         try {
            br = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        String s = null;
        try {
            while ((s = br.readLine()) != null) {
                pw.println(s);
            }
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
    }
}

package n1exercici3;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


public class Main {
    static String dirPath = System.getProperty("user.dir") + "/";
    static HashMap<String,String> recopilarDatos() throws FileNotFoundException {
        Path pathAbsolute = Paths.get(System.getProperty("user.dir"));
        Path pathBase = Paths.get("/n1exercici3/countries.txt");
        Path pathRelative = pathBase.relativize(pathAbsolute);
        System.out.println(pathRelative);
        File paisCapitales = new File(dirPath + "Sprint1/S103/src/n1exercici3/countries.txt");
        Scanner myReader = new Scanner(paisCapitales);
        HashMap<String, String> paisCapital = new HashMap<>();

        while (myReader.hasNextLine()) {
            String linia = myReader.nextLine();
            String[] paisCap = linia.split(" ");
            paisCapital.put(paisCap[0], paisCap[1]);    //Introduzco países y capitales en el HashMap
        }
        return paisCapital;
    }
    static String[] getPaisos(HashMap<String, String> paisCapital) {
        String[] paisos = new String[paisCapital.size()];
        int i = 0;
        for (String pais : paisCapital.keySet()) {  //String[] de países para poder acceder aleatoriamente
            paisos[i] = pais;
            i++;
        }
        return paisos;
    }

    static void guardarPuntuacio(String userName, int puntuacio) {
        try {
            FileWriter myWriter = new FileWriter(dirPath + "Sprint1/S103/src/n1exercici3/classificacio.txt",true);
            myWriter.write(userName + " " + puntuacio + System.lineSeparator());
            myWriter.close();
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    static String getRandomPais(String[] llistaPaisos, String[] excluded) {
        Random rand = new Random();

        while (true){
            int index = rand.nextInt(llistaPaisos.length);
            boolean repetido = false;
            for (String pais : excluded){
                if (pais != null){
                    if (pais.equals(llistaPaisos[index])) {
                        repetido = true;
                        break;
                    }
                }
                else{
                    break;
                }
            }
            if (!repetido){
                return llistaPaisos[index];
            }
        }
    }
    public static void main(String[] args) {
        HashMap<String, String> answerKey;
        try {
            answerKey = recopilarDatos();
            Scanner in = new Scanner(System.in);
            String userName;
            String[] llistaPaisos = getPaisos(answerKey);
            System.out.println("Nom d'usuari: ");
            userName = in.next();
            int puntuacio = 0;

            System.out.println("Introdueix la capital de");
            String[] paisosJaPreguntats = new String[10];
            for (int j = 0; j < 10; j++) {
                String pais = getRandomPais(llistaPaisos, paisosJaPreguntats);
                paisosJaPreguntats[j] = pais;
                System.out.println(pais);
                String resposta = in.next();
                if (resposta.equalsIgnoreCase(answerKey.get(pais))) {
                    puntuacio++;
                    System.out.println("Resposta correcta!");
                } else {
                    System.out.println("Resposta incorrecta :(");
                }
            }

            System.out.printf("La teva puntuació final és: %d", puntuacio);
            guardarPuntuacio(userName, puntuacio);

            in.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

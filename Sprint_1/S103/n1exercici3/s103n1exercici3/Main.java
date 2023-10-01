package s103n1exercici3;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    static HashMap<String,String> recopilarDatos(){
        try {
            File paisCapitales = new File("Sprint_1/S103/n1exercici3/s103n1exercici3/countries.txt");
            Scanner myReader = new Scanner(paisCapitales);
            HashMap<String, String> paisCapital = new HashMap<>();

            while (myReader.hasNextLine()) {
                String linia = myReader.nextLine();
                String[] paisCap = linia.split(" ");
                paisCapital.put(paisCap[0], paisCap[1]);    //Introduzco países y capitales en el HashMap
            }
            return paisCapital;
        }
        catch (FileNotFoundException ignored){
            return null;
        }
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
            FileWriter myWriter = new FileWriter("Sprint_1/S103/n1exercici3/s103n1exercici3/classificacio.txt",true);
            myWriter.write(userName + " " + puntuacio + System.lineSeparator());
            myWriter.close();
        }
        catch (IOException ignored) {}
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
        HashMap <String,String> answerKey = recopilarDatos();
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
            }
            else {
                System.out.println("Resposta incorrecta :(");
            }
        }

        System.out.printf("La teva puntuació final és: %d", puntuacio);
        guardarPuntuacio(userName, puntuacio);

        in.close();

        }
}

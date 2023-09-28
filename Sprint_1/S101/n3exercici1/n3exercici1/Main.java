package n3exercici1;
import java.util.ArrayList;
import java.util.*;

public class Main {
    static ArrayList<Redactor> redactors = new ArrayList<>();
    static void add_redactor(Redactor redactor) {
        redactors.add(redactor);
    }

    static boolean delete_redactor(String nom) {
        for (Redactor redactor : redactors){
            if(nom.equalsIgnoreCase(redactor.nom)) {
                redactors.remove(redactor);
                return true;
            }
        }
        return false;
    }

    static boolean add_news_redactor(Noticies noticia, String nom) {
        for (Redactor redactor : redactors) {
            if (nom.equalsIgnoreCase(redactor.nom)) {
                redactor.add_noticia(noticia);
                return true;
            }
        }
        return false;
    }
    static boolean del_news_redactor(String titulardel, String nom) {
        for (Redactor redactor : redactors) {
            if (nom.equalsIgnoreCase(redactor.nom)) {
                redactor.delete_noticia(noticia);
                return true;
            }
        }
        return false;
    }
    public static void optionMenu(String[] options) {
        for (String option : options) {
            System.out.println(option);
        }
    }

    public static Noticies createNews(int section, String titular, String text) {
        String competicio;
        String team;
        String jugador;
        Scanner in = new Scanner(System.in);
        if (section <= 3 ) {
            System.out.println("Si us plau, introdueix la competició a la que fa referència");
            competicio = in.nextLine();
        }
        if (section != 3){
            System.out.println("Si us plau, introdueix l'equip/club/escuderia de la notícia");
            team = in.nextLine();
        }
        if (section == 1 || section == 3) {
            System.out.println("Si us plau, introdueix el nom del jugador");
            jugador = in.nextLine();
        }

        if (section == 1) {
            Noticies newsAdd = new Futbol(titular, text, competicio, team, jugador);
            in.close();
            return newsAdd;
        }
        else if (section == 2) {
            Noticies newsAdd = new Basquet(titular, text, competicio, team);
            in.close();
            return newsAdd;
        }
        else if (section == 3) {
            Noticies newsAdd = new Tenis(titular, text, competicio, jugador);
            in.close();
            return newsAdd;
        }
        else if (section == 4) {
            Noticies newsAdd = new F1(titular, text, team);
            in.close();
            return newsAdd;
        }
        else {
            Noticies newsAdd = new Motociclisme(titular, text, team);
            in.close();
            return newsAdd;
        }

    }
    public static void main(String[] args) {
        String[] initialOptions = {"1- Introduir redactor",
                "2- Eliminar redactor",
                "3- Introduir notícia a un redactor",
                "4- Eliminar notícia",
                "5- Mostrar totes les notícies per redactor",
                "6- Calcular puntuació de la notícia",
                "7- Calcular preu-notícia",
                "8- Sortir"
        };

        String[] newsSections = {"1- futbol",
                "2- bàsquet",
                "3- tenis",
                "4- F1",
                "5- motociclisme",
        };

        System.out.println("Què vols fer?");
        Scanner in = new Scanner(System.in);
        int option;
        while (true) {
            optionMenu(initialOptions);
            option = in.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Si us plau, introdueix el nom del redactor");
                    String nomAdd = in.nextLine();
                    System.out.println("Si us plau, introdueix el dni del redactor");
                    String dni = in.nextLine();
                    Redactor redactorAdd = new Redactor(nomAdd,dni);
                    add_redactor(redactorAdd);
                    System.out.printf("Redactor %s afegit. Vols fer alguna cosa més?\n",redactorAdd.nom);
                    break;
                case 2:
                    System.out.println("Si us plau, introdueix el nom del redactor");
                    String nomDel = in.nextLine();         //assumeixo que l'usuari posarà un redactor existent
                    if (delete_redactor(nomDel)) {
                        System.out.printf("Redactor %s afegit. Vols fer alguna cosa més?\n", nomDel);
                    }
                    else {
                        System.out.println("Redactor no trobat. Vols fer alguna cosa més?");
                    }
                    break;
                case 3:
                    System.out.println("Si us plau, introdueix el titular de la notícia");
                    String titularAdd = in.nextLine();
                    System.out.println("Si us plau, introdueix el text de la notícia");
                    String textAdd = in.nextLine();
                    System.out.println("De quina secció és?");
                    optionMenu(newsSections);
                    int section = in.nextInt();
                    Noticies newsAdd = createNews(section, titularAdd, textAdd);
                    System.out.println("Si us plau, introdueix el nom del redactor");
                    String nomAddNews = in.nextLine();
                    if (add_news_redactor(newsAdd, nomAddNews)){
                        System.out.printf("Notícia %s afegida al redactor %s\n", newsAdd.titular, nomAddNews);
                    }
                    else {
                        System.out.println("Redactor no trobat. Vols fer alguna cosa més?");
                    }
                    break;
                case 4:
                    System.out.println("De quin redactor és la notícia?");
                    String nomDelNews = in.nextLine();
                    System.out.println("Quien és el titular de la notícia?");
                    String nomDelNews = in.nextLine();


            }
        }


        //Introduir noticia al redactor
        Noticies noticia_futbol = new Futbol("Un gol de pel·lícula", "text here", "Lliga de campions", "Barça", "Ferran Torres");
        Noticies noticia_tenis = new Tenis("titular sobre tenis", "text here", "Open", "Nadal");
        Noticies noticia_basquet = new Basquet("titular sobre basquet", "text here", "ABC", "Madrid");
        redactor1.add_noticia(noticia_futbol);
        redactor1.add_noticia(noticia_tenis);
        redactor1.add_noticia(noticia_basquet);

        //Eliminar noticia
        redactor1.delete_noticia(noticia_tenis);

        //Mostrar totes les notícies per redactor
        redactor1.show_all_news();

        //Calcular puntuació
        noticia_basquet.calcularPuntsNoticia();

        //Calcular preu
        noticia_tenis.calcularPreuNoticia();
        in.close();
    }
}

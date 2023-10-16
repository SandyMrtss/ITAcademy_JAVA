package n3exercici1;
import java.util.ArrayList;
import java.util.*;

public class Main {
    static ArrayList<Redactor> redactors = new ArrayList<>();

    static Redactor find_redactor(String nom){
        for (Redactor redactor : redactors){
            if(nom.equalsIgnoreCase(redactor.getNom())) {
                return redactor;
            }
        }
        return null;
    }
    public static void optionMenu(String[] options) {
        for (String option : options) {
            System.out.println(option);
        }
    }

    public static Noticies createNews(int section, String titular) {
        String competicio = "";
        String team = "";
        String jugador = "";
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
            return new Futbol(titular, competicio, team, jugador);
        }
        else if (section == 2) {
            return new Basquet(titular, competicio, team);
        }
        else if (section == 3) {

            return new Tenis(titular, competicio, jugador);
        }
        else if (section == 4) {
            return new F1(titular, team);
        }
        else {
            return new Motociclisme(titular, team);
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
        int option = 0;
        while (option < 8) {
            optionMenu(initialOptions);
            option = in.nextInt();
            in.nextLine();
            switch (option) {
                case 1 -> {
                    System.out.println("Si us plau, introdueix el nom del redactor");
                    String nomAdd = in.nextLine();
                    System.out.println("Si us plau, introdueix el dni del redactor");
                    String dni = in.nextLine();
                    Redactor redactorAdd = new Redactor(nomAdd, dni);
                    redactors.add(redactorAdd);
                    System.out.printf("Redactor %s afegit.\n", redactorAdd.getNom());
                    System.out.println("Vols fer alguna cosa més?");
                }
                case 2 -> {
                    System.out.println("Si us plau, introdueix el nom del redactor");
                    String nomDel = in.nextLine();//assumeixo que l'usuari posarà un redactor existent
                    Redactor redactorDel = find_redactor(nomDel);
                    if (redactorDel != null) {
                        redactors.remove(redactorDel);
                        System.out.printf("Redactor %s esborrat.\n", nomDel);
                    } else {
                        System.out.println("Redactor no trobat.");
                    }
                    System.out.println("Vols fer alguna cosa més?");
                }
                case 3 -> {
                    System.out.println("Si us plau, introdueix el titular de la notícia");
                    String titularAdd = in.nextLine();
                    System.out.println("Si us plau, introdueix el text de la notícia");
                    System.out.println("De quina secció és?");
                    optionMenu(newsSections);
                    int section = in.nextInt();
                    in.nextLine();
                    Noticies newsAdd = createNews(section, titularAdd);
                    System.out.println("Si us plau, introdueix el nom del redactor");
                    String nomAddNews = in.nextLine();
                    Redactor redactorAddNew = find_redactor(nomAddNews);
                    if (redactorAddNew != null) {
                        redactorAddNew.getNoticies().add(newsAdd);
                        System.out.printf("Noticia %s afegiga al redactor %s.\n", newsAdd.getTitular(), redactorAddNew.getNom());
                    } else {
                        System.out.println("Redactor no trobat.");
                    }
                    System.out.println("Vols fer alguna cosa més?");
                }
                case 4 -> {
                    System.out.println("De quin redactor és la notícia?");
                    String nomDelNews = in.nextLine();
                    Redactor redactorDelNew = find_redactor(nomDelNews);
                    if (redactorDelNew == null) {
                        System.out.println("Redactor no trobat.");
                        System.out.println("Vols fer alguna cosa més?");
                        break;
                    }
                    System.out.println("Quien és el titular de la notícia?");
                    String titularDel = in.nextLine();
                    Noticies noticiaDel = redactorDelNew.find_noticia(titularDel);
                    if (noticiaDel != null) {
                        redactorDelNew.getNoticies().remove(noticiaDel);
                        System.out.printf("Noticía %s eliminada del redactor %s.\n", titularDel, nomDelNews);
                    } else {
                        System.out.println("Noticia no trobada.");
                    }
                    System.out.println("Vols fer alguna cosa més?");
                }
                case 5 -> {
                    for (Redactor redactor : redactors) {
                        redactor.show_all_news();
                    }
                    System.out.println("Vols fer alguna cosa més?");
                }
                case 6, 7 -> {
                    System.out.println("De quin redactor és la notícia?");
                    String nomP = in.nextLine();
                    Redactor redactorP = find_redactor(nomP);
                    if (redactorP == null) {
                        System.out.println("Redactor no trobat.");
                        System.out.println("Vols fer alguna cosa més?");
                        break;
                    }
                    System.out.println("Quien és el titular de la notícia?");
                    String titularP = in.nextLine();
                    Noticies noticiaP = redactorP.find_noticia(titularP);
                    if (redactorP.find_noticia(titularP) == null) {
                        System.out.println("Noticia no trobada.");
                        System.out.println("Vols fer alguna cosa més?");
                        break;
                    }
                    if (option == 6) {
                        noticiaP.calcularPuntsNoticia();
                        System.out.printf("Punts noticia %s: %d\n", noticiaP.getTitular(), noticiaP.getPunts());
                    } else {
                        noticiaP.calcularPreuNoticia();
                        System.out.printf("Preu noticia %s: %d€\n", noticiaP.getTitular(), noticiaP.getPreu());
                    }
                }
                default -> {
                    option = 8;
                    System.out.println("Programa finalitzat");
                }
            }
        }
        in.close();
    }


}


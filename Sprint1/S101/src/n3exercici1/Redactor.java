package n3exercici1;
import java.util.ArrayList;
public class Redactor {
    private String nom;
    private String dni;
    private int sou = 1500;
    private ArrayList<Noticies> noticies = new ArrayList<>();

    public Redactor(String nom, String dni){
        this.nom = nom;
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public ArrayList<Noticies> getNoticies() {
        return noticies;
    }

    public void setNoticies(ArrayList<Noticies> noticies) {
        this.noticies = noticies;
    }

    public Noticies find_noticia(String titular){
        for (Noticies noticia : this.noticies) {
            if ((noticia.getTitular()).equalsIgnoreCase(titular)) {
                return noticia;
            }
        }
        return null;
    }
    public void show_all_news(){
        System.out.printf("AUTOR: %s \n", this.nom);
        for (Noticies noticia: noticies) {
            noticia.show_noticia();
        }
    }
}
package n3exercici1;
import java.util.ArrayList;
public class Redactor {
    public String nom;
    public String dni;
    public int sou = 1500;
    public ArrayList<Noticies> noticies = new ArrayList<>();

    public Redactor(String nom, String dni){
        this.nom = nom;
        this.dni = dni;
    }


    public void add_noticia(Noticies noticia){
        this.noticies.add(noticia);
    }

    public void delete_noticia(Noticies noticia){
        this.noticies.remove(noticia);
    }

    public void show_all_news(){
        System.out.printf("AUTOR: %s \n", this.nom);
        for (Noticies noticia: noticies) {
            noticia.show_noticia();
        }
    }
}
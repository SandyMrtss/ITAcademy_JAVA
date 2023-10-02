package s103n2exercici1;
import java.util.HashSet;


public class Restaurant extends HashSet{
    public String nom;
    public int puntuacio;

    public Restaurant(String nom, int puntuacio) {
        this.nom = nom;
        this.puntuacio = puntuacio;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this){
            return true;
        }
        Restaurant restAdd = (Restaurant) o;
        if (restAdd != null) {
            if (this.puntuacio == restAdd.puntuacio & this.nom.equals(restAdd.nom)) {
                return true;
            }
        }
        return false;
    }
}

package n2exercici1;
import com.sun.jdi.ClassNotPreparedException;

public class Restaurant implements Comparable<Restaurant> {
    private String nom;
    private int puntuacio;

    public Restaurant(String nom, int puntuacio) {
        this.nom = nom;
        this.puntuacio = puntuacio;
    }

    public String getNom() {
        return nom;
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    @Override
    public int hashCode() {
        return nom.hashCode() * puntuacio;
    }

    @Override
    public boolean equals(Object o) {
        if (o.getClass() != Restaurant.class) {
            throw new ClassNotPreparedException();
        }
        if (o == this){
            return true;
        }
        Restaurant restAdd = (Restaurant) o;
        return this.puntuacio == restAdd.puntuacio & this.nom.equals(restAdd.nom);

    }

    @Override
    public int compareTo(Restaurant r1){
        int i = this.nom.compareTo(r1.nom);
        if(i == 0){
            i = r1.puntuacio - this.puntuacio;
        }
        return i;
    }

}


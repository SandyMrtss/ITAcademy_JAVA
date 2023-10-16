package n2exercici2;
import n2exercici1.Restaurant;
import java.util.*;

public class Main {
    static class compareRestaurants implements Comparator<Restaurant>{
        @Override
        public int compare(Restaurant r1, Restaurant r2) {
            int i = r1.getNom().compareTo(r2.getNom());
            if(i == 0){
                i = r2.getPuntuacio() - r1.getPuntuacio();
            }
            return i;
        }
    }
    public static void main(String[] args) {
        Set<Restaurant> bbddOrdenada = new TreeSet<>(new compareRestaurants());
        Restaurant restaurant1 = new Restaurant("McDonald's", 1);
        Restaurant restaurant2 = new Restaurant("KFC", 2);
        Restaurant restaurant3 = new Restaurant("Casa Castro", 10);
        Restaurant restaurant4 = new Restaurant("Casa Castro", 7);

        bbddOrdenada.add(restaurant1);
        bbddOrdenada.add(restaurant2);
        bbddOrdenada.add(restaurant3);
        bbddOrdenada.add(restaurant4);

        for (Restaurant restaurant : bbddOrdenada){
            System.out.printf("Nom: %s, Puntuació: %d\n", restaurant.getNom(), restaurant.getPuntuacio());
        }

    }

}
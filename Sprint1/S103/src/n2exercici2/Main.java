package n2exercici2;
import n2exercici1.Restaurant;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Comparator<Restaurant> restaurantComparator = Restaurant::compareTo;

        Set<Restaurant> bbddOrdenada = new TreeSet<>(restaurantComparator);
        Restaurant restaurant1 = new Restaurant("Casa Castro", 7);
        Restaurant restaurant2 = new Restaurant("Casa Castro", 10);
        Restaurant restaurant3 = new Restaurant("McDonald's", 1);
        Restaurant restaurant4 = new Restaurant("KFC", 2);


        bbddOrdenada.add(restaurant1);
        bbddOrdenada.add(restaurant2);
        bbddOrdenada.add(restaurant3);
        bbddOrdenada.add(restaurant4);

        for (Restaurant restaurant : bbddOrdenada){
            System.out.printf("Nom: %s, Puntuació: %d\n", restaurant.getNom(), restaurant.getPuntuacio());
        }

    }

}
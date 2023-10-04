package n2exercici1;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Restaurant> bbdd = new HashSet<>();
        Restaurant restaurant1 = new Restaurant("McDonald's", 1);
        Restaurant restaurant2 = new Restaurant("McDonald's", 1);
        Restaurant restaurant3 = new Restaurant("McDonald's", 2);


        bbdd.add(restaurant1);
        bbdd.add(restaurant2);
        bbdd.add(restaurant3);

        for (Restaurant restaurant : bbdd){
            System.out.printf("Nom: %s, Puntuació: %d\n", restaurant.nom, restaurant.puntuacio);
        }





    }
}

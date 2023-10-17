package n3exercici4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> myContainer = new ArrayList<>();
        Shop mercadona = new Shop("Mercadona", "Someone rich", 9999999);
        Car myCar = new Car("Citroen", 5, 300);
        myContainer.add(mercadona);
        myContainer.add(myCar);
        myContainer.add("hola");
        myContainer.add(123);
        myContainer.add(23.5);
    }

}

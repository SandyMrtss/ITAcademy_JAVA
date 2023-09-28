package n1exercici2;

public class Cotxe {
    final static String brand = "Toyota";
    static String model;
    final int power = 1000;

    public Cotxe(String model) {
        this.model = model;     //Única variable inicialitzable al constructor
    }
    static void frenar(){
        System.out.println("El vehicle està frenant");
    }

    public void accelerar(){
        System.out.println("El vehicle està accelerant");
    }

}
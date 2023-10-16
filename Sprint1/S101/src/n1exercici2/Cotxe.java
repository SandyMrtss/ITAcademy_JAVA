package n1exercici2;

public class Cotxe {
    final private static String brand = "Toyota";
    private static String model;
    final private int power = 1000;

    public Cotxe() {
        this.model = "Auris";     //Única variable inicialitzable al constructor
    }
    static void frenar(){
        System.out.println("El vehicle està frenant");
    }

    public void accelerar(){
        System.out.println("El vehicle està accelerant");
    }

}
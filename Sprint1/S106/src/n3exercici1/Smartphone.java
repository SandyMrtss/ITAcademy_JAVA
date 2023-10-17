package n3exercici1;

public class Smartphone implements Phone{
    private String brand;
    private int number;

    public Smartphone(String brand, int number) {
        this.brand = brand;
        this.number = number;
    }

    static void takePictures(){
        System.out.println("Smartphone is taking pictures");
    }

    public void call() {
        System.out.println("Phone is calling");
    }
}

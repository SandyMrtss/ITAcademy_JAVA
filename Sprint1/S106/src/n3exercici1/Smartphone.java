package n3exercici1;

public class Smartphone implements Phone {
    private String brand;
    private int number;

    public Smartphone(String brand, int number) {
        this.brand = brand;
        this.number = number;
    }

    public void takePictures(){
        System.out.printf("Smartphone %s is taking pictures\n", this.brand);
    }
    @Override
    public void call() {
        System.out.printf("Phone %s is calling\n", this.brand);
    }
}

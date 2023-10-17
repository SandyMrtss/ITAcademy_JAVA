package n3exercici1;

public class Main {
    public static void main(String[] args) {
        Smartphone iPhone = new Smartphone("iPhone", 601356495);

        Generic.phoneGeneric(iPhone);
        Generic.smartphoneGeneric(iPhone);
    }
}

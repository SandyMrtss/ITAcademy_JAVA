package n2exercici1;

interface Camera {
    public void fotografiar();
}

interface Rellotge {
    public void alarma();
}

public class Telefon {
    String marca;
    String model;

    void trucar(int numero_telf) {
        System.out.println("S'està trucant al " + numero_telf);
    }
}

class Smartphone extends Telefon implements Camera, Rellotge {
    public void fotografiar() {
        System.out.println("S'està fent una fotografia");
    }
    public void alarma() {
        System.out.println("Està sonant l'alarma");
    }

}


package n2exercici1;

class Smartphone extends Telefon implements Camera, Rellotge {
    public void fotografiar() {
        System.out.println("S'està fent una fotografia");
    }

    public void alarma() {
        System.out.println("Està sonant l'alarma");
    }

}

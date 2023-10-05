package n1exercici1;

class Cuerda extends Instrument {
    {
        this.name = "guitarra";
        System.out.println("He sigut creat per l'accés a una classe filla!");
    }

    static {
        price = 150;
        System.out.println("Accès a membre estàtic");
    }
    public void play() {
        System.out.println("Està sonant un instrument de corda");
    }
}

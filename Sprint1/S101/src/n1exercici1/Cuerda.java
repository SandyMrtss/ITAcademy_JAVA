package n1exercici1;

class Cuerda extends Instrument {

    public Cuerda(String name, int price) {
        super(name, price);
    }

    public void play() {
        System.out.println("Està sonant un instrument de corda");
    }
}

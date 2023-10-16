package n1exercici1;

class Percussion extends Instrument {

    public Percussion(String name, int price) {
        super(name, price);
    }

    public void play() {
        System.out.println("Està sonant un instrument de percussió");
    }
}

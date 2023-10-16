package n1exercici1;
class Wind extends Instrument {

    public Wind(String name, int price) {
        super(name, price);
    }

    public void play() {
        System.out.println("Està sonant un instrument de vent");
    }
}


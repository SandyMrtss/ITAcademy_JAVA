package n1exercici1;

class Percussion extends Instrument {
    {
        this.name = "tambor";
    }

    static {
        price = 300;
    }

    public void play() {
        System.out.println("Està sonant un instrument de percussió");
    }
}

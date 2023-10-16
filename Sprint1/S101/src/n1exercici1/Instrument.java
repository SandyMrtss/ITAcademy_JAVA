package n1exercici1;

public abstract class Instrument {
    private String name;
    private int price;

    public Instrument(String name, int price){
        this.name = name;
        this.price = price;
    }

    abstract void play();

}


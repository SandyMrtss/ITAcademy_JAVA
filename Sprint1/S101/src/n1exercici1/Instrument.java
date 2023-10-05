package n1exercici1;

public abstract class Instrument {
    public String name;
    public static int price;

    public Instrument(){
        System.out.println("He sigut creat pel constructor de la classe n1exercici1.Instrument!");
    }

    abstract void play();

}


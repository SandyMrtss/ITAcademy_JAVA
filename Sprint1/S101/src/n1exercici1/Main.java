package n1exercici1;

public class Main {
    public static void main(String[] args) {
        Wind flauta = new Wind("flauta", 5);
        flauta.play();
        Cuerda guitar = new Cuerda("guitar", 200);
        guitar.play();
        Percussion tambor = new Percussion("tambor", 150);
        tambor.play();
    }
}
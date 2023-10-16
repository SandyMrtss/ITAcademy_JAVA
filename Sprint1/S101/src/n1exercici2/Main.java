package n1exercici2;
import static n1exercici2.Cotxe.*;
public class Main{
    public static void main(String[] args) {
        Cotxe.frenar();   //Com és estàtica, es pot cridar sense inicialitzar objecte
        Cotxe auris = new Cotxe();
        auris.accelerar();    //Cal crear objecte

    }
}

package n3exercici1.exceptions;

public class ExcepcioButacaLliure extends Exception {
    public ExcepcioButacaLliure() {
        super("Butaca no reservada prèviament. Reserva no anul·lada.");
    }
}

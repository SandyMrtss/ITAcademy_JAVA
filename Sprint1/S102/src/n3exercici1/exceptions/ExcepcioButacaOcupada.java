package n3exercici1.exceptions;

public class ExcepcioButacaOcupada extends Exception {
    public ExcepcioButacaOcupada() {
        super("Butaca ocupada prèviament. Reserva no realitzada.");
    }
}

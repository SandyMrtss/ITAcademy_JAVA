package n3exercici1;

public class ExcepcionsCine extends Exception{
    public ExcepcionsCine(String message) {
        super(message);
    }
}

class ExcepcioButacaOcupada extends ExcepcionsCine{
    public ExcepcioButacaOcupada(){
        super("Butaca ocupada prèviament. Reserva no realitzada.");
    }
}
class ExcepcioButacaLliure extends ExcepcionsCine{
    public ExcepcioButacaLliure(){
        super("Butaca no reservada prèviament. Reserva no anulada.");
    }
}

class ExcepcioNomPersonaIncorrecte extends ExcepcionsCine {
    public ExcepcioNomPersonaIncorrecte(){
        super("Nom no vàlid.");
    }
}
class ExcepcioFilaIncorrecte extends ExcepcionsCine {
    public ExcepcioFilaIncorrecte(){
        super("Fila no exisent");
    }
}
class ExcepcioSeientIncorrecte extends ExcepcionsCine {
    public ExcepcioSeientIncorrecte(){
        super("Seient no existent");
    }
}
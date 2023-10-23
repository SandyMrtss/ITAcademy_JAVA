package n1exercici1;

public class VendaBuidaException extends Exception {

    public VendaBuidaException(){
        super();
    }
    public String getMessage(){
        return "Per fer una venda primer has d'afegir productes";
    }
}

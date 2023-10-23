package n1exercici1;

public class Venda {
    private Producte[] productes;
    private double preuTotal = 0;

    public Venda(Producte[] productes){
        this.productes = productes;
    }


    public void calcularTotal() throws VendaBuidaException{
        try {
            if(productes.length == 0){
                throw new VendaBuidaException();
            }
            for(Producte producte : productes){
                this.preuTotal += producte.getPreu();
            }
            System.out.printf("Preu Total = %.2f €\n", this.preuTotal);
        }
        catch (ArrayIndexOutOfBoundsException ex){
            throw new VendaBuidaException();
        }
    }
}


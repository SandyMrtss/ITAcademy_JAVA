package S102n1exercici1;

public class Venda {
    public Producte[] productes;
    public double preuTotal = 0;

    public Venda(Producte[] productes){
        this.productes = productes;
    }

    public void calcularTotal() throws VendaBuidaException {
        try {
            for (int i = 0; i < productes.length; i++) {
                System.out.println(productes.length);
                preuTotal += productes[i].preu;
            }
            System.out.printf("Preu Total = %.2f €", this.preuTotal);
        }
        catch (VendaBuidaException ex){
            ex.getMessage();

        }

    }
}


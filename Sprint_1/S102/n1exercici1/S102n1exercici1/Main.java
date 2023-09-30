package S102n1exercici1;

public class Main {
    public static void main(String[] args) throws VendaBuidaException {
        Producte poma = new Producte("Poma", 0.5);
        Producte sucre = new Producte("Sucre", 2.3);
        Producte sabo = new Producte("Sabó", 4);

        Producte[] productesCap = {};
        Producte[] productes = {poma, sucre, sabo};

        Venda vendaBuida = new Venda(productesCap);
        Venda vendaProd = new Venda (productes);

        System.out.println("Intentem una venda buida:");
        vendaBuida.calcularTotal();

        System.out.println("Intentem una venda amb productes:");
        vendaProd.calcularTotal();
    }
}
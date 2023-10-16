package n2exercici1;

class Telefon {
    private String marca;
    private String model;

    public Telefon(String marca, String model){
        this.marca = marca;
        this.model = model;
    }

    void trucar(int numero_telf) {
        System.out.println("S'està trucant al " + numero_telf);
    }
}


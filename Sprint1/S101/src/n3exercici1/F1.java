package n3exercici1;

class F1 extends Noticies {
    private String escuderia;

    public F1(String titular, String escuderia) {
        super(titular);
        this.escuderia = escuderia;
    }

    public void calcularPreuNoticia() {
        int preu = 100;
        if (escuderia.equalsIgnoreCase("Ferrari") || escuderia.equalsIgnoreCase("Mercedes")) {
            preu += 50;
        }
        this.setPreu(preu);
    }

    public void calcularPuntsNoticia() {
        int punts = 4;
        if (escuderia.equalsIgnoreCase("Ferrari") || escuderia.equalsIgnoreCase("Mercedes")) {
            punts += 2;
        }
        this.setPunts(punts);
    }
}

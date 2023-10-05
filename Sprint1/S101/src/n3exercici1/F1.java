package n3exercici1;

class F1 extends Noticies {
    public String escuderia;

    public F1(String titular, String text, String escuderia) {
        super(titular, text);
        this.escuderia = escuderia;
    }

    public void calcularPreuNoticia() {
        int preu = 100;
        if (escuderia.equalsIgnoreCase("Ferrari") || escuderia.equalsIgnoreCase("Mercedes")) {
            preu += 50;
        }
        this.preu = preu;
    }

    public void calcularPuntsNoticia() {
        int punts = 4;
        if (escuderia.equalsIgnoreCase("Ferrari") || escuderia.equalsIgnoreCase("Mercedes")) {
            punts += 2;
        }
        this.punts = punts;
    }
}

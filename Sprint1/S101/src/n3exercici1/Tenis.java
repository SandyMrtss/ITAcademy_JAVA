package n3exercici1;

class Tenis extends Noticies {
    public String competicio;
    public String jugador;

    public Tenis(String titular, String text, String competicio, String jugador) {
        super(titular, text);
        this.competicio = competicio;
        this.jugador = jugador;
    }

    public void calcularPreuNoticia() {
        int preu = 150;
        if (jugador.equalsIgnoreCase("Federer") || jugador.equalsIgnoreCase("Nadal") || jugador.equalsIgnoreCase("Djokovic")) {
            preu += 100;
        }
        this.preu = preu;
    }

    public void calcularPuntsNoticia() {
        int punts = 4;
        if (jugador.equalsIgnoreCase("Federer") || jugador.equalsIgnoreCase("Nadal") || jugador.equalsIgnoreCase("Djokovic")) {
            punts += 3;
        }
        this.punts = punts;
    }

}

package n3exercici1;

class Tenis extends Noticies {
    private String competicio;
    private String jugador;

    public Tenis(String titular, String competicio, String jugador) {
        super(titular);
        this.competicio = competicio;
        this.jugador = jugador;
    }

    @Override
    public void calcularPreuNoticia() {
        int preu = 150;
        if (jugador.equalsIgnoreCase("Federer") || jugador.equalsIgnoreCase("Nadal") || jugador.equalsIgnoreCase("Djokovic")) {
            preu += 100;
        }
        this.setPreu(preu);
    }

    @Override
    public void calcularPuntsNoticia() {
        int punts = 4;
        if (jugador.equalsIgnoreCase("Federer") || jugador.equalsIgnoreCase("Nadal") || jugador.equalsIgnoreCase("Djokovic")) {
            punts += 3;
        }
        this.setPunts(punts);
    }

}

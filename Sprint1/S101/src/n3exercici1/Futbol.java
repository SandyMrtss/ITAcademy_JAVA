package n3exercici1;

class Futbol extends Noticies {
    private String competicio;
    private String club;
    private String jugador;

    public Futbol(String titular, String competicio, String club, String jugador) {
        super(titular);
        this.competicio = competicio;
        this.club = club;
        this.jugador = jugador;
    }

    @Override
    public void calcularPreuNoticia() {
        int preu = 300;
        if (competicio.equalsIgnoreCase("Lliga de Campions")) {
            preu += 100;
        }
        if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
            preu += 100;
        }
        if (jugador.equalsIgnoreCase("Ferran Torres") || jugador.equalsIgnoreCase("Benzema")) {
            preu += 50;
        }
        this.setPreu(preu);
    }

    @Override
    public void calcularPuntsNoticia() {
        int punts = 5;
        if (competicio.equalsIgnoreCase("Lliga de Campions")) {
            punts += 3;
        }
        if (competicio.equalsIgnoreCase("Lliga")) {
            punts += 2;
        }
        if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
            punts += 1;
        }
        if (jugador.equalsIgnoreCase("Ferran Torres") || jugador.equalsIgnoreCase("Benzema")) {
            punts += 1;
        }
        this.setPunts(punts);
    }
}

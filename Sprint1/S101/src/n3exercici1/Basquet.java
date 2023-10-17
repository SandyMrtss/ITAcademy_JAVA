package n3exercici1;

class Basquet extends Noticies {
    private String competicio;
    private String club;

    public Basquet(String titular, String competicio, String club) {
        super(titular);
        this.competicio = competicio;
        this.club = club;
    }

    @Override
    public void calcularPreuNoticia() {
        int preu = 250;
        if (competicio.equalsIgnoreCase("Eurolliga")) {
            preu += 75;
        }
        if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
            preu += 75;
        }
        this.setPreu(preu);
    }

    @Override
    public void calcularPuntsNoticia() {
        int punts = 4;
        if (competicio.equalsIgnoreCase("Eurolliga")) {
            punts += 3;
        }
        if (competicio.equalsIgnoreCase("ACB")) {
            punts += 2;
        }
        if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
            punts += 1;
        }
        this.setPunts(punts);
    }
}

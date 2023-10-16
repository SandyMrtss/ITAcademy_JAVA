package n3exercici1;

class Motociclisme extends Noticies {
    private String equip;

    public Motociclisme(String titular, String equip) {
        super(titular);
        this.equip = equip;
    }

    public void calcularPreuNoticia() {
        int preu = 100;
        if (equip.equalsIgnoreCase("Honda") || equip.equalsIgnoreCase("Yamaha")) {
            preu += 50;
        }
        this.setPreu(preu);
    }

    public void calcularPuntsNoticia() {
        int punts = 3;
        if (equip.equalsIgnoreCase("Honda") || equip.equalsIgnoreCase("Yamaha")) {
            punts += 3;
        }
        this.setPunts(punts);
    }
}

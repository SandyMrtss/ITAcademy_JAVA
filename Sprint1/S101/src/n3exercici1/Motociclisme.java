package n3exercici1;

class Motociclisme extends Noticies {
    public String equip;

    public Motociclisme(String titular, String text, String equip) {
        super(titular, text);
        this.equip = equip;
    }

    public void calcularPreuNoticia() {
        int preu = 100;
        if (equip.equalsIgnoreCase("Honda") || equip.equalsIgnoreCase("Yamaha")) {
            preu += 50;
        }
        this.preu = preu;
    }

    public void calcularPuntsNoticia() {
        int punts = 3;
        if (equip.equalsIgnoreCase("Honda") || equip.equalsIgnoreCase("Yamaha")) {
            punts += 3;
        }
        this.punts = punts;
    }
}

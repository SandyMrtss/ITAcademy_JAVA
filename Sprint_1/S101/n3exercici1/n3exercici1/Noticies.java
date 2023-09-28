package n3exercici1;

abstract class Noticies {
    public String titular;
    public String text;
    public int punts;
    public int preu;

    public Noticies(String titular, String text){
        this.titular = titular;
        this.text = text;
    }
    public void show_noticia(){
        System.out.println(this.titular);
    }

    abstract void calcularPreuNoticia();
    abstract void calcularPuntsNoticia();
}

class Futbol extends Noticies {
    public String competicio;
    public String club;
    public String jugador;

    public Futbol(String titular, String text, String competicio, String club, String jugador) {
        super(titular, text);
        this.competicio = competicio;
        this.club = club;
        this.jugador = jugador;
    }

    public void calcularPreuNoticia(){
        int preu = 300;
        if (competicio == "Lliga de Campions") {
            preu += 100;
        }
        if (club == "Barça" || club == "Madrid") {
            preu += 100;
        }
        if (jugador == "Ferran Torres" || jugador == "Benzema") {
            preu += 50;
        }
        this.preu = preu;
    }

    public void calcularPuntsNoticia(){
        int punts = 5;
        if (competicio == "Lliga de Campions") {
            punts += 3;
        }
        if (competicio == "Lliga") {
            punts += 2;
        }
        if (club == "Barça" || club == "Madrid") {
            punts += 1;
        }
        if (jugador == "Ferran Torres" || jugador == "Benzema") {
            punts += 1;
        }
        this.punts = punts;
    }
}


class Basquet extends Noticies {
    public String competicio;
    public String club;

    public Basquet(String titular, String text, String competicio, String club) {
        super(titular, text);
        this.competicio = competicio;
        this.club = club;
    }

    public void calcularPreuNoticia(){
        int preu = 250;
        if (competicio == "Eurolliga") {
            preu += 75;
        }
        if (club == "Barça" || club == "Madrid") {
            preu += 75;
        }
        this.preu = preu;
    }

    public void calcularPuntsNoticia(){
        int punts = 4;
        if (competicio == "Eurolliga") {
            punts += 3;
        }
        if (competicio == "ACB") {
            punts += 2;
        }
        if (club == "Barça" || club == "Madrid") {
            punts += 1;
        }
        this.punts = punts;
    }
}

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
        if (jugador == "Federer" || jugador == "Nadal" || jugador == "Djokovic") {
            preu += 100;
        }
        this.preu =  preu;
    }
    public void calcularPuntsNoticia(){
        int punts = 4;
        if (jugador == "Federer" || jugador == "Nadal" || jugador == "Djokovic") {
            punts += 3;
        }
        this.punts =  punts;
    }

}
class F1 extends Noticies {
    public String escuderia;

    public F1(String titular, String text, String escuderia) {
        super(titular, text);
        this.escuderia = escuderia;
    }

    public void calcularPreuNoticia() {
        int preu = 100;
        if (escuderia == "Ferrari" || escuderia == "Mercedes") {
            preu += 50;
        }
        this.preu = preu;
    }

    public void calcularPuntsNoticia(){
        int punts = 4;
        if (escuderia == "Ferrari" || escuderia == "Mercedes") {
            punts += 2;
        }
        this.punts = punts;
    }
}

class Motociclisme extends Noticies {
    public String equip;

    public Motociclisme(String titular, String text, String equip) {
        super(titular, text);
        this.equip = equip;
    }

    public void calcularPreuNoticia() {
        int preu = 100;
        if (equip == "Honda" || equip == "Yamaha") {
            preu += 50;
        }
        this.preu = preu;
    }

    public void calcularPuntsNoticia(){
        int punts = 3;
        if (equip == "Honda" || equip == "Yamaha") {
            punts += 3;
        }
        this.punts = punts;
    }
}


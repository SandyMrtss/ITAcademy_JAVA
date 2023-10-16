package n3exercici1;

abstract class Noticies {
    private String titular;
    private String text;
    private int punts;
    private int preu;

    public Noticies(String titular){
        this.titular = titular;
        this.text = "";
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getPunts() {
        return punts;
    }

    public void setPunts(int punts) {
        this.punts = punts;
    }

    public int getPreu() {
        return preu;
    }

    public void setPreu(int preu) {
        this.preu = preu;
    }

    public void show_noticia(){
        System.out.println(this.titular);
    }

    abstract void calcularPreuNoticia();
    abstract void calcularPuntsNoticia();
}



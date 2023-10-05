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



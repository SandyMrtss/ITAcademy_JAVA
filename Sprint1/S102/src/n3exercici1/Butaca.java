package n3exercici1;

public class Butaca {
    public final int nFila;
    public final int nSeient;
    public final String nomReserva;

    public Butaca(int nFila, int nSeient, String nomReserva) {
        this.nFila = nFila;
        this.nSeient = nSeient;
        this.nomReserva = nomReserva;
    }
    public int getnFila() {
        return nFila;
    }
    public int getnSeient(){
        return nSeient;
    }
    public String getNomReserva(){
        return nomReserva;
    }
    static boolean Equals(Butaca a, Butaca b){
        return (a.nFila == b.nFila & a.nSeient == b.nSeient);
    }
    public String toString(){
        return "Fila:" + this.nFila + ", Seient:" + this.nSeient + ", Persona:" + this.nomReserva;
    }
}

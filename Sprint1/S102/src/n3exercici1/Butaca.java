package n3exercici1;

public class Butaca {
    private final int nFila;
    private final int nSeient;
    private final String nomReserva;

    public Butaca(int nFila, int nSeient, String nomReserva) {
        this.nFila = nFila;
        this.nSeient = nSeient;
        this.nomReserva = nomReserva;
    }
    public int getNFila() {
        return nFila;
    }
    public int getNSeient(){
        return nSeient;
    }
    public String getNomReserva(){
        return nomReserva;
    }
    static boolean Equals(Butaca a, Butaca b){
        return (a.nFila == b.nFila & a.nSeient == b.nSeient);
    }
    @Override
    public String toString(){
        return "Fila:" + this.nFila + ", Seient:" + this.nSeient + ", Persona:" + this.nomReserva;
    }
}

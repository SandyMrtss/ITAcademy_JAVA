package n3exercici1;


import java.util.Objects;

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

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Butaca butaca = (Butaca) object;
        return nFila == butaca.nFila && nSeient == butaca.nSeient && Objects.equals(nomReserva, butaca.nomReserva);
    }

    @Override
    public String toString(){
        return "Fila:" + this.nFila + ", Seient:" + this.nSeient + ", Persona:" + this.nomReserva;
    }
}

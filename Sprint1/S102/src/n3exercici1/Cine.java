package n3exercici1;
import n2exercici1.Entrada;
import n3exercici1.exceptions.*;
import java.util.ArrayList;

public class Cine {
    private int nFiles;
    private int nSeientsFila;
    private final GestioButaques gestioButaques;


    public Cine(){
        gestioButaques = new GestioButaques();
        demanarDadesInicials();
    }
    public void iniciar() {
        int option = -1;
        while (option != 0){
            option = menu();
            switch (option) {
                case 1 -> mostrarButaques();
                case 2 -> mostrarButaquesPersona();
                case 3 -> reservarButaca();
                case 4 -> anularReserva();
                case 5 -> anularReservaPersona();
                default -> {
                    option = 0;
                    System.out.println("Programa finalitzat");
                }
            }
        }
    }
    public int menu(){
        System.out.println("Què voleu fer?");
        System.out.println("""
                1.- Mostrar totes les butaques reservades.
                2.- Mostrar les butaques reservades per una persona.
                3.- Reservar una butaca.
                4.- Anul·lar la reserva d’una butaca.
                5.- Anul·lar totes les reserves d’una persona.
                0.- Sortir.""");
        return Entrada.llegirInt("Número opció triada:");
    }
    public void mostrarButaques() {
        ArrayList<Butaca> butaques = gestioButaques.getButaques();
        System.out.println("BUTAQUES RESERVADES");
        for (Butaca butaca : butaques) {
            System.out.println(butaca.toString());
        }
    }
    public void mostrarButaquesPersona(){
        String nom = Entrada.llegirString("Qui ha fet la reserva?");
        System.out.printf("BUTAQUES RESERVADES PER %S\n", nom);
        ArrayList<Butaca> butaques = gestioButaques.getButaques();
        for (Butaca butaca : butaques) {
            String nomReserva = butaca.getNomReserva();
            if(nom.equalsIgnoreCase(nomReserva)){
                System.out.println(butaca.toString());
            }
        }
    }
    public void reservarButaca() {
        try {
            int fila = introduirFila();
            int seient = introduirSeient();
            String persona = introduirPersona();
            Butaca butaca = new Butaca(fila, seient, persona);
            gestioButaques.afegirButaca(butaca);
            System.out.println("Butaca reservada correctament");
        }
        catch (ExcepcioFilaIncorrecte | ExcepcioSeientIncorrecte | ExcepcioButacaOcupada |ExcepcioNomPersonaIncorrecte ex){
            System.out.println(ex.getMessage());
        }
    }
    public void anularReserva(){
        try {
            int fila = introduirFila();
            int seient = introduirSeient();
            gestioButaques.eliminarButaca(fila, seient);
            System.out.println("Reserva anul·lada correctament");
        }
        catch (ExcepcioFilaIncorrecte | ExcepcioSeientIncorrecte | ExcepcioButacaLliure ex){
            System.out.println(ex.getMessage());
        }
    }
    public void anularReservaPersona() {
        try {
            String persona = introduirPersona();
            ArrayList<Butaca> butaques = gestioButaques.getButaques();
            ArrayList<Butaca> butaquesCopia;
            butaquesCopia = (ArrayList<Butaca>) butaques.clone();
            boolean algunaReserva = false;
            for(Butaca butaca : butaquesCopia){
                if (butaca.getNomReserva().equalsIgnoreCase(persona)){
                    gestioButaques.eliminarButaca(butaca.getNFila(), butaca.getNSeient());
                    algunaReserva = true;
                }
            }
            if(!algunaReserva){
                throw new ExcepcioNomPersonaIncorrecte();
            }
            System.out.printf("Reserves de %s anul·lades correctament\n", persona);
        }
        catch (ExcepcioButacaLliure | ExcepcioNomPersonaIncorrecte ex){
            System.out.println(ex.getMessage());
        }

    }
    public String introduirPersona() throws ExcepcioNomPersonaIncorrecte {
        String persona = Entrada.llegirString("Introdueix nom");
        for(int i = 0; i < persona.length(); i++){
            if (Character.isDigit(persona.charAt(i))) {
                throw new ExcepcioNomPersonaIncorrecte();
            }
        }
        return persona;
    }
    public void demanarDadesInicials(){
        this.nFiles = Entrada.llegirInt("Quantes files hi ha?");
        this.nSeientsFila = Entrada.llegirInt("Quants seients hi ha per fila?");
    }

    public int introduirFila() throws ExcepcioFilaIncorrecte {
        int fila = Entrada.llegirInt("Introdueix número de fila");
        if (fila > 0 & fila <= nFiles){
            return fila;
        }
        throw new ExcepcioFilaIncorrecte();
    }
    public int introduirSeient() throws ExcepcioSeientIncorrecte {
        int seient = Entrada.llegirInt("Introdueix número de seient");
        if (seient > 0 & seient <= nSeientsFila){
            return seient;
        }
        throw new ExcepcioSeientIncorrecte();
    }
}
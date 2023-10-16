package n3exercici1;
import n3exercici1.exceptions.*;

import java.util.ArrayList;

public class GestioButaques {
    public final ArrayList<Butaca> butaques;

    public GestioButaques(){
        this.butaques = new ArrayList<>();
    }
    public ArrayList<Butaca> getButaques(){
        return this.butaques;
    }

    public int cercarButaca(int nFila, int nSeient){
        for (Butaca butaca : butaques) {
            if (butaca.getNFila() == nFila & butaca.getNSeient() == nSeient) {
                return butaques.indexOf(butaca);
            }
        }
        return -1;
    }
    public void afegirButaca(Butaca butaca) throws Exception {
        if (cercarButaca(butaca.getNFila(), butaca.getNSeient()) == -1) {
            butaques.add(butaca);
        }
        else throw new ExcepcioButacaOcupada();
    }
    public void eliminarButaca(int fila, int seient) throws Exception {
        for(Butaca butaca : butaques){
            if (butaca.getNFila() == fila & butaca.getNSeient() == seient) {
                butaques.remove(butaca);
                return;
            }
        }
        throw new ExcepcioButacaLliure();
    }
}
